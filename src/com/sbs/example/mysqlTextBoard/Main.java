package com.sbs.example.mysqlTextBoard;

import com.sbs.example.mysqlTextBoard.util.Util;

public class Main {
	public static void main(String[] args) {
		new App().run();

//		testApi();

	}

	private static void testApi() {
		String url = "https://disqus.com/api/3.0/forums/listThreads.json";
		String rs = Util.callApi(url, "api_key=FHq3NgPDalTrO2rcA3f69BSETX8dYqpSyAZ5fsSyGVFQpx5S7L33VeR6YTihgjCh",
				"forum=my-smg", "thread:ident=article_detail_2.html");
		System.out.println(rs);

	}
}
