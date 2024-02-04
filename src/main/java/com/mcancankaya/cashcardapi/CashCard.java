package com.mcancankaya.cashcardapi;

import org.springframework.data.annotation.Id;

public record CashCard(@Id Long ID, Double amount) {
}
