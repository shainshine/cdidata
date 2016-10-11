package cdi;

import java.io.IOException;

public class Demo extends BasicAction{

	private static final long serialVersionUID = 1L;

	public String returnStr(){
		try {
			String str = "{'retStr':'0','total':'8411039','dailyAvg':'7591','instant':'','daily':'8526','idsum':'243231909'}";
			response.reset();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return NONE;
	}
}
