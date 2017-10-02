package tw.jimmy.lab;

import javax.servlet.http.HttpServletRequest;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;

public class GetClientUsername {
	private String username;

	@Init
	public void init() {
		HttpServletRequest request = (HttpServletRequest) Executions
				.getCurrent().getNativeRequest();
		username = request.getRemoteUser();
		// username = Executions.getCurrent().getRemoteUser();
		System.out.println(username);
	}

	public String getUsername() {
		return username;
	}

}
