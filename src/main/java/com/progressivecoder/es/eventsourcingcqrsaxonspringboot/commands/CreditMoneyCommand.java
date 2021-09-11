package com.progressivecoder.es.eventsourcingcqrsaxonspringboot.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CreditMoneyCommand {

    public final double creditAmount;

    public final String currency;

    @TargetAggregateIdentifier
    public final String id;

    public CreditMoneyCommand(String id, double creditAmount, String currency) {
        this.id = id;
        this.creditAmount = creditAmount;
        this.currency = currency;
    }
}
