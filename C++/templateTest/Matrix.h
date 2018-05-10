#ifndef MATRIX_H_INCLUDED
#define MATRIX_H_INCLUDED

#include<iostream>
using namespace std;

template<typename T,int m,int n>
class Matrix{
private:
	T a[m][n];

public:
	//���캯��
	Matrix(){
		for(int i =0;i<m;i++){
			for(int j =0;j<n;j++){
				a[i][j] = 0;
			}
		}
	}

	//�������캯��
	Matrix(Matrix& ma){
		for(int i =0;i<m;i++){
			for(int j =0;j<n;j++){
				a[i][j] = ma.a[i][j];
			}
		}
	}

	//��������
	~Matrix(){
		cout<<"������������"<<endl;
	}

	void input(){
		for(int i =0;i<m;i++){
			for(int j =0;j<n;j++){
				cin>>a[i][j];
			}
		}

	}

	void const print(){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				cout<<"  "<<a[i][j];

			}
			cout<<endl;
		}
	}
};

#endif // MATRIX_H_INCLUDED
