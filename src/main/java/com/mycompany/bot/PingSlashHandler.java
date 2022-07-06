package com.mycompany.bot;

import com.symphony.bdk.core.activity.command.CommandContext;
import com.symphony.bdk.core.service.message.MessageService;
import com.symphony.bdk.spring.annotation.Slash;

import org.springframework.stereotype.Component;

@Component
public class PingSlashHandler {

  private final MessageService messageService;

  public PingSlashHandler(MessageService messageService) {
    this.messageService = messageService;
  }

  @Slash(value = "/ping")
  public void onSlashPing(CommandContext context) {
    this.messageService.send(context.getStreamId(), "pong");
  }
}
