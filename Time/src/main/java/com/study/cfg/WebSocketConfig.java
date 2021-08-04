package com.study.cfg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class WebSocketConfig implements WebSocketHandler {

    private static Logger log = LoggerFactory.getLogger(WebSocketConfig.class);
    private static Map<String , WebSocketSession> socketPool = new HashMap<>();
    private static AtomicInteger connectCount = new AtomicInteger();

    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        socketPool.put(webSocketSession.getId(),webSocketSession);
        connectCount.incrementAndGet();
        log.info("connect [{}]",webSocketSession.getId());

    }

    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {

    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {

    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }


}
