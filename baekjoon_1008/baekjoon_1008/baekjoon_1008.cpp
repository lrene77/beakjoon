//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

#include <iostream>
#include <iomanip> //setprecision을 쓰기위한 선언

int main()
{   
    int a, b; // 초기화
    a < 0; // 범위설정
    b > 10; // 범위설정

    std::cin >> a >> b; // 입력
    std::cout << std::setprecision(12)<<(double)a / b; // 출력 setprecision으로 소수점 출력수 제한 및 (double)로 형변환
}
