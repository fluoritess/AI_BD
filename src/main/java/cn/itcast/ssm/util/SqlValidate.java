package cn.itcast.ssm.util;

/**
 * @author tyh
 * @Package cn.edu.cdu.utils
 * @Description:
 * @date 2018/6/10 15:49
 */
public class SqlValidate {
    public static boolean isValidate(String str){
        //统一转为小写
        str = str.toLowerCase();
        //过滤掉的sql关键字，可以手动添加
        String badStr = "'|and|exec|execute|insert|select|delete|update|count|drop|*|%|chr|mid|master|truncate|" +
                "char|declare|sitename|net user|xp_cmdshell|;|or|-|+|,|like'|and|exec|execute|insert|create|drop|" +
                "table|from|grant|use|group_concat|column_name|" +
                "information_schema.columns|table_schema|union|where|select|delete|update|order|by|count|*|" +
                "chr|mid|master|truncate|char|declare|or|;|-|--|+|,|like|//|/|%|#";
        String[] badStrs = badStr.split("\\|");
        for (int i = 0; i < badStrs.length; i++) {
            if (str.indexOf(badStrs[i]) >= 0) {
                return true;
            }
        }
        return false;
    }
}
