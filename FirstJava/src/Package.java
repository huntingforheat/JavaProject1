
public class Package {
	
	/*
	 * 패키지란?
	 *  - 서로 연관된 클래스들의 묶음을 말함(package)
	 *  - 패키지 안에는 여러 클래스를 포함하고 있음.
	 *  
	 *  특정 패키지를 불러서 사용하려면, import 키워드를 사용.
	 *  ex> import java.util.Arrays
	 *  	import [패키지명].[클래스명] => 패키지명:java.util, 클래스명: Arrays
	 *  	패키지명은 처음부터 끝까지 전체 패키지를 모두 표현해야 함.
	 *  
	 *  - 특정 패키지내에 클래스를 호출하는 경우,
	 *  	import java.util.Arrays
	 *  	import java.util.Scanner // 입력 클래스
	 *  	import java.io.PrintWriter // 화면 출력 클래스
	 *  
	 *  
	 *  - 특정 패키지 내에 모든 클래스를 호출하는 경우
	 *  	import java.util.*
	 *  
	 *  *** 클래스 생성시에 현재 클래스의 패키지 위치를 선언.
	 *  	- (생략시 default 패키지를 가리킴 -src 폴더 위치)
	 *  	- 패키지를 가리키는 클래스 내의 키워드는 package 키워드를 사용
	 *  	- 다른 패키지 위치에 있는 클래스는 import 키워드를 사용함.
	 *  
	 *  ### 패키지 생성 규칙
	 *  	- 패키지 이름은 영문 소문자를 이용하는 것을 권장.
	 *  	- 대분류와 소분류 패키지들을 구분. 구분은 "."(dot)을 이용함.
	 *  	- 루트 패키지 이름은 java.으로 시작할 수 없음.
	 *  	- 자바의 키워드들도 패키지 이름으로 사용할 수 없음.
	 *  	- import시에는 중분류가 있을 떄에 반드시 써줘야함.	
	 *  
	 */		
}
