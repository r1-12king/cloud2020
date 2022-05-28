import java.time.ZonedDateTime;

/**
 * @version 1.0
 * @auther lgl
 * @date 2022/5/28 17:20
 * @description:
 */
public class T2
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

       //2022-05-28T17:21:12.404+08:00[Asia/Shanghai]
    }
}
