// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.logger;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.a;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class LoggerOuterClass$LogMessage extends GeneratedMessageLite<LoggerOuterClass$LogMessage, a> implements d1
{
    private static final LoggerOuterClass$LogMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile n1<LoggerOuterClass$LogMessage> PARSER;
    public static final int SEVERITY_FIELD_NUMBER = 1;
    private String message_;
    private int severity_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LoggerOuterClass$LogMessage.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LoggerOuterClass$LogMessage()));
    }
    
    private LoggerOuterClass$LogMessage() {
        this.message_ = "";
    }
    
    public static /* synthetic */ LoggerOuterClass$LogMessage access$000() {
        return LoggerOuterClass$LogMessage.DEFAULT_INSTANCE;
    }
    
    private void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }
    
    private void clearSeverity() {
        this.severity_ = 0;
    }
    
    public static LoggerOuterClass$LogMessage getDefaultInstance() {
        return LoggerOuterClass$LogMessage.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LoggerOuterClass$LogMessage loggerOuterClass$LogMessage) {
        return (a)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)loggerOuterClass$LogMessage);
    }
    
    public static LoggerOuterClass$LogMessage parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LoggerOuterClass$LogMessage parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, byteString);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final l l) throws IOException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, l);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final l l, final d0 d0) throws IOException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final InputStream inputStream) throws IOException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, array);
    }
    
    public static LoggerOuterClass$LogMessage parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LoggerOuterClass$LogMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LoggerOuterClass$LogMessage> parser() {
        return (n1<LoggerOuterClass$LogMessage>)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setMessage(final String message_) {
        message_.getClass();
        this.message_ = message_;
    }
    
    private void setMessageBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }
    
    private void setSeverity(final LoggerOuterClass$Severity loggerOuterClass$Severity) {
        this.severity_ = loggerOuterClass$Severity.getNumber();
    }
    
    private void setSeverityValue(final int severity_) {
        this.severity_ = severity_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (y80.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return 1;
            }
            case 5: {
                final n1<LoggerOuterClass$LogMessage> parser;
                if ((parser = LoggerOuterClass$LogMessage.PARSER) == null) {
                    synchronized (LoggerOuterClass$LogMessage.class) {
                        if (LoggerOuterClass$LogMessage.PARSER == null) {
                            LoggerOuterClass$LogMessage.PARSER = (n1<LoggerOuterClass$LogMessage>)new GeneratedMessageLite$c((GeneratedMessageLite)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LoggerOuterClass$LogMessage.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LoggerOuterClass$LogMessage.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[] { "severity_", "message_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LoggerOuterClass$LogMessage();
            }
        }
    }
    
    public String getMessage() {
        return this.message_;
    }
    
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }
    
    public LoggerOuterClass$Severity getSeverity() {
        LoggerOuterClass$Severity loggerOuterClass$Severity;
        if ((loggerOuterClass$Severity = LoggerOuterClass$Severity.forNumber(this.severity_)) == null) {
            loggerOuterClass$Severity = LoggerOuterClass$Severity.UNRECOGNIZED;
        }
        return loggerOuterClass$Severity;
    }
    
    public int getSeverityValue() {
        return this.severity_;
    }
    
    public static final class a extends GeneratedMessageLite$b<LoggerOuterClass$LogMessage, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LoggerOuterClass$LogMessage.access$000());
        }
    }
}
