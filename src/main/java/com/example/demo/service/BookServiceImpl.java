package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDTO;
import com.example.demo.entity.BookEN;
import com.example.demo.repository.BookRepository;

@Service // 비즈니스 로직을 처리하는 역할을 명시
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repository; // 사용할 리파지토리를 멤버로 선언

	
//	@Override
//	public int register(BookDTO dto) {
//		BookEN entity = dtoToEntity(dto); // 컨트롤러에서 전달받은 dto를 엔티티로 변환
//		repository.save(entity); // 리파티토리에 엔티티를 전달하여 저장
//
//		return entity.getNo(); // 새로 등록된 게시물의 번호를 반환
//	}
//
//	@Override
//	public List<BookDTO> getList() {
//		List<BookEN> result = repository.findAll(); // 데이터베이스에서 게시물 목록을 가져온다
//		List<BookDTO> list = new ArrayList<>();
//		list = result.stream() // 리스트에서 스트림 생성
//				.map(entity -> entityToDto(entity)) // 중간연산으로 엔티티를 dto로 변환
//				.collect(Collectors.toList());
//		
//		return list;
//	}
//
//	@Override
//	public BookDTO read(int no) {
//
//		Optional<BookEN> result = repository.findById(no);
//
//		if (result.isPresent()) {
//			BookEN book = result.get();
//			return entityToDto(book);
//		} else {
//			return null;
//		}
//	}
//
//	@Override
//	public void modify(BookDTO dto) {
//		// 업데이트 하는 항목은 '제목', '내용'
//		Optional<BookEN> result = repository.findById(dto.getNo());
//		if (result.isPresent()) { // 해당 게시물이 존재하는지 확인
//			BookEN entity = result.get();
//
//			entity.setTitle(dto.getTitle());
//			entity.setContent(dto.getContent());
//
//			repository.save(entity);
//		}
//
//	}

	@Override
	public int remove(int no) {

		Optional<BookEN> result = repository.findById(no);
		
		if (result.isPresent()) {
			repository.deleteById(no);
			return 1; //성공
		}else {
			return 0; //실패
		}
		
	}

	@Override
	public int register(BookDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BookDTO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDTO read(int no) {
		// TODO Auto-generated method stub
		return null; 
	}

}
