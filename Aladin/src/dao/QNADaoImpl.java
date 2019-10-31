package dao;

import java.util.ArrayList;

import data.Database;
import vo.NoticeVO;
import vo.QNAVO;

public class QNADaoImpl implements QNADao {
public static QNADaoImpl instance;
	
	private QNADaoImpl(){
		
	}
	public static QNADaoImpl getInstance(){
		if(instance == null){
			instance = new QNADaoImpl();
		}
		return instance;
	}
	Database database = Database.getInstance();
	
	
	@Override
	public QNAVO selectQNA(String key, int value) { // 게시글 선택
		for(int i =0; i <database.tb_qnaList.size(); i++){
			QNAVO number = database.tb_qnaList.get(i);
			if(key.equals(database.tb_qnaList.get(i))){
				if(number.getNumber()==value){
					return number;
				}
			}
		}
		return null;
	}

	@Override
	public ArrayList<QNAVO> selectQNA() { // 전체 게시글 출력

		return database.tb_qnaList;
	}

	@Override
	public void insertQNA(QNAVO number) { //QNA 추가
		database.tb_qnaList.add(number);
		
		
	}

	@Override
	public void deleteQNA(int number) { // QNA삭제
		database.tb_qnaList.remove(number);
		
	}

	@Override
	public void modifyNotice(QNAVO number) {//QNA수정
		for(int i=0; i<database.tb_qnaList.size(); i++){
			if(database.tb_qnaList.get(i).getNumber() == number.getNumber()){
				database.tb_qnaList.remove(i);
			}
		}database.tb_qnaList.add(number);
		
	}

}
