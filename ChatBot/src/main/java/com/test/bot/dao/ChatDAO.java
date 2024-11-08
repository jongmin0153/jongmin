package com.test.bot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.bot.dto.ChatDTO;
import com.test.bot.mapper.ChatMapper;


@Repository
public class ChatDAO {
	
	@Autowired
	private ChatMapper mapper;

	public int add(ChatDTO dto) {
		
		return mapper.add(dto);
	}

	public List<ChatDTO> list(String seq) {
		
		return mapper.list(seq);
	}

}
