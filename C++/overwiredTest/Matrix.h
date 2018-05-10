#ifndef MATRIX_H_INCLUDED
#define MATRIX_H_INCLUDED
#include<iostream>
using namespace std;
//ȫ�ֱ�����������
const int Row = 4,Col = 4;

class Matrix{
	int i,j;
	double a[Row][Col];
public:
    //���캯��,Ĭ��ֵΪ0
	Matrix(){
		for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				a[i][j] = 0;
			}
		}
	}
	//���ƹ��캯��
	Matrix(Matrix& m){
		for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				a[i][j] = m.a[i][j];
			}
		}
	}
	//���ز�����+��-��<<
	Matrix operator+(Matrix&);
	Matrix operator-(Matrix&);
	friend ostream & operator<<(ostream &out,Matrix &m);
	//��������
	void input();
};

#endif // MATRIX_H_INCLUDED
