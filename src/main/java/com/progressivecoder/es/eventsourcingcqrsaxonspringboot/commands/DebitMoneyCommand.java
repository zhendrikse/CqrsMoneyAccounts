package com.progressivecoder.es.eventsourcingcqrsaxonspringboot.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class DebitMoneyCommand {

    public final double debitAmount;

    public final String currency;

    @TargetAggregateIdentifier
    public final String id;

    public DebitMoneyCommand(String id, double debitAmount, String currency) {
        this.id = id;
        this.debitAmount = debitAmount;
        this.currency = currency;
    }
}
