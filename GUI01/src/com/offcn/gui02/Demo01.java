package com.offcn.gui02;

import java.util.ArrayList;

public class Demo01 {
	public static void main(String[]args) {
		//����һ�����ϣ�����һ�����飬���������Ӣ��
		ArrayList<Hero>team=new ArrayList<>();
		//�������Ӣ�۶���
		Hero one=new Hero("���ļ�",200);
		Hero two=new Hero("����",200);
		Hero three=new Hero("���ʽ�",200);
		Hero four=new Hero("����̫һ",200);
		Hero five=new Hero("����",200);
		
		//�����Ӣ����ӵ�������
		team.add(one);
		team.add(two);
		team.add(three);
		team.add(four);
		team.add(five);
		//�������ϣ���������չʾ
		for(int i=0;i<team.size();i++){
		//��ȡ��ǰӢ��
		Hero hero=team.get(i);
		System.out.println("Ӣ������:"+hero.getName()+",������:"+hero.getAttack());
		}
	}

}
