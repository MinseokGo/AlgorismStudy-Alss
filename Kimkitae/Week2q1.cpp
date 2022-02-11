#include <iostream>
#include <iomanip>
using std::setw;

#define N 10

using namespace std;
 
int main()
{
	int a[N] = {3,8,6,5,7,9,0,2,1,4};
	int tmp;

	for(int i = 0; i < N -1; i++){				
		for(int j = 0; j < N - i - 1; j++){ 	// 이 줄에서 i는 i개 만큼 정렬이 완료 되었다는 뜻
			if(a[j] < a[j + 1]){
				tmp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = tmp;
			}
		}
	}

	for(int i = 0; i < N; i++){
		cout << "답" << a[i] << endl;
	}

    return 0;
}
