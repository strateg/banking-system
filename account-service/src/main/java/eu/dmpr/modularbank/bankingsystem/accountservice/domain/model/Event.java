package eu.dmpr.modularbank.bankingsystem.accountservice.domain.model;

import java.time.ZonedDateTime;
import java.util.UUID;

import static com.google.common.base.Preconditions.checkNotNull;

public abstract class Event {

  private final UUID aggregateId;
  private final ZonedDateTime timestamp;
  private final int version;

  protected Event(UUID aggregateId, ZonedDateTime timestamp, int version) {
    this.aggregateId = checkNotNull(aggregateId);
    this.timestamp = checkNotNull(timestamp);
    this.version = version;
  }

  public UUID getAggregateId() {
    return aggregateId;
  }

  public ZonedDateTime getTimestamp() {
    return this.timestamp;
  }

  public int getVersion() {
    return version;
  }
}
