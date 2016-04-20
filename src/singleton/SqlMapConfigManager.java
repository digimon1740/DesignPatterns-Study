/**
 *   	SqlMapConfigManager 객체를 메모리에 한번만 올리기위해 싱글턴 패턴을 사용함 
 *    	쿼리 수행 객체 SqlMapClient 를 초기화시킴
 *
 *      Creator by sanghoon 
 *        2013-02-13
 * */
package singleton;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import util.Const;

import java.io.IOException;
import java.io.Reader;

public class SqlMapConfigManager {

	Reader reader;
	private SqlMapClient sqlMapper_cust; // 고객사 뷰테이블 쿼리수행객체
	private SqlMapClient sqlMapper_kebi; // 케비테이블 쿼리수행객체
	private static SqlMapConfigManager instance = new SqlMapConfigManager();

	// 생성자를 외부에서 접근하지 못하도록 private
	private SqlMapConfigManager() {
		try {
			initCustomerSession();    //	고객사 제공 DB 세션 생성
			initKebiSession();        //	케비메일 DB 세션 생성
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initCustomerSession() throws IOException {
		// SqlMapConfig 환경설정 파일을 읽음
		reader = Resources
				.getResourceAsReader(Const.CUSTOMER_XML);

		// 쿼리수행객체 SqlMapClient 를 메모리에 올림
		sqlMapper_cust = SqlMapClientBuilder.buildSqlMapClient(reader);

		readerClose(reader);
	}

	public void initKebiSession() throws IOException {
		// SqlMapConfig 환경설정 파일을 읽음
		reader = Resources
				.getResourceAsReader(Const.KEBI_XML);

		// 쿼리수행객체 SqlMapClient 를 메모리에 올림
		sqlMapper_kebi = SqlMapClientBuilder.buildSqlMapClient(reader);

		readerClose(reader);
	}

	public void readerClose(Reader reader) throws IOException {
		if (null != reader) reader.close();
	}

	public static SqlMapConfigManager getInstance() {
		return instance;
	}

	public SqlMapClient getSqlMapperCust() {
		return sqlMapper_cust;
	}

	public SqlMapClient getSqlMapperKebi() {
		return sqlMapper_kebi;
	}

//	public static void main(String[] args) {
//		SqlMapConfigManager config = SqlMapConfigManager.getInstance();
//		
//		SqlMapClient kebi = config.getSqlMapperKebi();
//		System.out.println(kebi);
//		SqlMapClient cust = config.getSqlMapperCust();
//		System.out.println(cust);
//		
//	}

}
