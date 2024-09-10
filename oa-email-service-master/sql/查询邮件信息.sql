SELECT
    a.empNo AS toEmpNo,
    a.empName AS toEmpName,
    IFNULL( GROUP_CONCAT( DISTINCT a.ccEmpNo ), '' ) AS ccEmpNos,
    IFNULL( GROUP_CONCAT( DISTINCT a.bccEmpNo ), '' ) AS bccEmpNos,
    GROUP_CONCAT( a.filePath ) AS filePath,
    a.moduleName,
    a.isAttach
FROM
    (
        SELECT
            a.empNo,
            a.empName,
            ( SELECT empNo FROM oa_emp WHERE fid = f1.empId ) AS ccEmpNo,
            ( SELECT empNo FROM oa_emp WHERE fid = f2.empId ) AS bccEmpNo,
            CONCAT( d.filePath, '2021-07-07', '\\', d.attachName ) AS filePath,
            e.moduleName,
            e.isAttach
        FROM
            oa_emp a
                LEFT JOIN oa_recipient_list b ON a.fid = b.empId
                LEFT JOIN oa_recipient_list_ccids f1 ON b.fid = f1.recipientListId AND f1.dataState = 1
                LEFT JOIN oa_recipient_list_bccids f2 ON b.fid = f2.recipientListId AND f2.dataState = 1
                LEFT JOIN oa_attach_name_attr c ON b.fid = c.recipientListId
                LEFT JOIN oa_attach_name d ON c.attachNameId = d.fid
                LEFT JOIN oa_mail_module e ON e.fid = b.moduleId
        WHERE
                a.dataState = 1
          AND b.dataState = 1
          AND ( ( c.dataState = 1 AND d.dataState = 1 ) OR e.isAttach = 0 )
          AND b.dataState = 1
          AND e.fid = 1
        GROUP BY
            a.empNo,
            a.empName,
            f1.empId,
            f2.empId,
            e.fid,
            e.moduleName,
            d.filePath,
            d.attachName,
            e.isAttach
    ) a
GROUP BY
    a.empNo,
    a.empName,
    a.moduleName,
    a.isAttach