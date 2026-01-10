package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.simpleBoard.answer.Answer;
import com.example.simpleBoard.answer.AnswerRepository;
import com.example.simpleBoard.question.Question;
import com.example.simpleBoard.question.QuestionRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class MysiteApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	
	@Transactional
	@Test
	void contextLoads() {
/*		Question q1 = new Question();
		q1.setSubject("궁금합니다.");
		q1.setContent("질문 내용입니다.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("git공부가 필요합니다.");
		q2.setContent("git에 대한 질문 내용입니다.");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
		
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());
		
		Question q = all.get(0);
		assertEquals("궁금합니다.", q.getSubject());
		
		Optional<Question> op = this.questionRepository.findById(4);
		if(op.isPresent()) {
			Question q = op.get();
			assertEquals("git에 대한 질문 내용입니다.", q.getContent());
			System.out.println(q.getContent());
		}
		this.questionRepository.deleteById(1);
		this.questionRepository.deleteById(2);
		Question q = this.questionRepository.findBySubjectAndContent
("궁금합니다.", "질문 내용입니다.");
		assertEquals(1, q.getId());		
		List<Question> qList = this.questionRepository.findBySubjectLike
("%니다%");
		Question q = qList.get(0);
		System.out.println(q.getSubject());
		Optional<Question> q = this.questionRepository.findById(1);
		assertTrue(q.isPresent());
		
		Question question = q.get();
		question.setSubject("수정된 제목");
		Question q_example = new Question();
		q_example.setSubject("~~~ 궁금합니다.");
		q_example.setContent("~~~~ 질문 내용입니다.");
		q_example.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q_example);
		
		Answer a_example = new Answer();
		a_example.setContent("~~~에 대한 질문 내용 답변입니다.");
		a_example.setCreateDate(LocalDateTime.now());
		a_example.setCreateDate(LocalDateTime.now());
		a_example.setQuestion(q_example);
		this.answerRepository.save(a_example);
	
		for(int i=1; i<51; i++) {
			Question q_for = new Question();
			q_for.setSubject("테스트 코드를 이용해 생성한 내용: [내용"+i+"]");
			q_for.setContent("테스트 코드를 이용해 생성한 제목: [제목"+i+"]");
			q_for.setCreateDate(LocalDateTime.now());
			this.questionRepository.save(q_for);
		}
			
		for(int i=4; i<54; i++) {
			this.questionRepository.deleteById(i);
		}	
		
		Question q_example = new Question();
		q_example.setSubject("~~~ 궁금합니다.");
		q_example.setContent("~~~~ 질문 내용입니다.");
		q_example.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q_example);
		
		for(int i=1; i<59; i++) {
			Answer a_example = new Answer();
			a_example.setContent("~~~에 대한 질문 내용 답변입니다.["+i+"]");
			a_example.setCreateDate(LocalDateTime.now());
			a_example.setQuestion(q_example);
			this.answerRepository.save(a_example);
		}
		
		List<Answer> op = this.answerRepository.findByQuestion(q_example);
		for (Answer a : op) {
		    System.out.println("답변 ID: " + a.getId());
		    System.out.println("답변 내용: " + a.getContent());
		    System.out.println("답변 날짜: " + a.getCreateDate());
		    System.out.println("-------------------------");
		}
 */
		Optional<Question> oq = this.questionRepository.findById(104);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		List<Answer> answerList = q.getAnswerList();
		System.out.println(answerList.get(0).getContent());
		System.out.println(answerList.size());
		
	}
}