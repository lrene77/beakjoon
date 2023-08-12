/*
	제목 : Hello World 출력하기
	기능 : 문자열의 출력
	파일이름 : HelloComment.c
	수정날짜 : 2022.06.01
	작성자 : 나
*/

#include <stdio.h> //헤더파일의 선언

int world(void) { //main함수의 시작
	/*
		이 함수 내에서는 하나의 문자열을 출력한다.
		문자열은 모니터로 출력 된다.
	*/

	printf("Hello World! \n"); //문자열의 출력
	return 0; // 0의 반환
}// main 함수의 끝