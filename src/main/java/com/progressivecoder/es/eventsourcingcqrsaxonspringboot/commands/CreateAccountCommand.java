package com.progressivecoder.es.eventsourcingcqrsaxonspringboot.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CreateAccountCommand {

    public final double accountBalance;

    public final String currency;

    @TargetAggregateIdentifier
    public final String id;

    public CreateAccountCommand(String id, double accountBalance, String currency) {
        this.id = id;
        this.accountBalance = accountBalance;
        this.currency = currency;
    }
}
