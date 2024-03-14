package com.inditex.service;

import static org.hamcrest.Matchers.hasSize;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser(username = "admin", password = "admin")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IntegrationTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	@Order(1)
	void shouldReturnPricesForGivenCriteria_Test1() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prices").param("date", "2020-06-14T10:00:00Z").param("productId", "35455").param("brandId", "1")
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(1)));

	}

	@Test
	@Order(2)
	void shouldReturnPricesForGivenCriteria_Test2() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prices").param("date", "2020-06-14T16:00:00Z").param("productId", "35455").param("brandId", "1")
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(1)));

	}

	@Test
	@Order(3)
	void shouldReturnPricesForGivenCriteria_Test3() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prices").param("date", "2020-06-14T21:00:00Z").param("productId", "35455").param("brandId", "1")
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(1)));

	}

	@Test
	@Order(4)
	void shouldReturnPricesForGivenCriteri_Test4() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prices").param("date", "2020-06-15T10:00:00Z").param("productId", "35455").param("brandId", "1")
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(1)));

	}

	@Test
	@Order(5)
	void shouldReturnPricesForGivenCriteria_Test5() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/prices").param("date", "2020-06-16T21:00:00Z").param("productId", "35455").param("brandId", "1")
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.jsonPath("$.*", hasSize(1)));

	}

}
