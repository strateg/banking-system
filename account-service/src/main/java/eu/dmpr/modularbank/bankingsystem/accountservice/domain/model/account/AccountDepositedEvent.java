package eu.dmpr.modularbank.bankingsystem.accountservice.domain.model.account;


import eu.dmpr.modularbank.bankingsystem.accountservice.domain.model.Event;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

import static com.google.common.base.Preconditions.checkNotNull;

public class AccountDepositedEvent extends Event {

  private final BigDecimal amount;
  private final BigDecimal balance;

  public AccountDepositedEvent(UUID aggregateId, ZonedDateTime timestamp, int version,
      BigDecimal amount, BigDecimal balance) {
    super(aggregateId, timestamp, version);
    this.amount = checkNotNull(amount);
    this.balance = checkNotNull(balance);
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public BigDecimal getBalance() {
    return balance;
  }
}
