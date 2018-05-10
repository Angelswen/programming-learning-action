#include"Matrix.h"
#include<iostream>
#include<iomanip>
using namespace std;

//���ز�����+
Matrix Matrix::operator+(Matrix& m){
	Matrix tmp;
	for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				tmp.a[i][j] = a[i][j] + m.a[i][j];
			}
		}
	return tmp;
}
//���ز�����-
Matrix Matrix::operator-(Matrix& m){
	Matrix tmp;
	for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				tmp.a[i][j] = a[i][j] - m.a[i][j];
			}
		}
	return tmp;
}
//�������뺯��
void Matrix::input(){
	cout<<"������"<<Row<<"*"<<Col<<"����: ";
	for(i=0;i<Row;i++){
			for(j=0;j<Col;j++){
				cin>>a[i][j];
			}
		}
}
//���ز�����<<,�������������
ostream & operator<<(ostream &out,Matrix &m){
	int i,j;
	for(i=0;i<Row;i++){
		for(j=0;j<Col;j++){
			out<<setw(5)<<m.a[i][j];
			}
		out<<endl;
    }
	return out;
}


