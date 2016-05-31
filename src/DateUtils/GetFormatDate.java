package DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetFormatDate {
	/**
	 *@function 获取当前时间
	 *@cong.fu @2016/05/31
	 * @return
	 */
	public static String getCurrentDate(){
		String dateString = "";   
	    Date dt = new Date();   
	    //HH表示24小时制    如果换成hh表示12小时制   
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
	    dateString = sdf.format(dt); 
	    return dateString;
	}
	
	/**
     * 将字符串类型的时间转换为Date类型
     * @param str 时间字符串
     * @param pattern 格式
     * @return 返回Date类型
     */
    public static Date formatString(String str,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date time=null;
        //需要捕获ParseException异常，如不要捕获，可以直接抛出异常，或者抛出到上层
        try {
            time = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }
    
    /**
     * 获取当月第一天的日期
     * @author cong.fu
     * @date 2016/05/31
     * @return 返回日期字符串类型
     */
    public static String getMonthFirstDate() {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Calendar c = Calendar.getInstance(); 
	String firstDate = null; 
	try { 
	    c.set(Calendar.DATE, 1);
	    firstDate = sdf.format(c.getTime());
	} catch (Exception e) { 
	    e.printStackTrace(); 
	} 
	return firstDate;  
    }
}
































