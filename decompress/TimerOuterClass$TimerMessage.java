// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.timer;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import l90.a;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class TimerOuterClass$TimerMessage extends GeneratedMessageLite<TimerOuterClass$TimerMessage, a> implements d1
{
    private static final TimerOuterClass$TimerMessage DEFAULT_INSTANCE;
    public static final int DURATION_MILLIS_FIELD_NUMBER = 1;
    private static volatile n1<TimerOuterClass$TimerMessage> PARSER;
    private int durationMillis_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)TimerOuterClass$TimerMessage.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new TimerOuterClass$TimerMessage()));
    }
    
    private TimerOuterClass$TimerMessage() {
    }
    
    public static /* synthetic */ TimerOuterClass$TimerMessage access$000() {
        return TimerOuterClass$TimerMessage.DEFAULT_INSTANCE;
    }
    
    private void clearDurationMillis() {
        this.durationMillis_ = 0;
    }
    
    public static TimerOuterClass$TimerMessage getDefaultInstance() {
        return TimerOuterClass$TimerMessage.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final TimerOuterClass$TimerMessage timerOuterClass$TimerMessage) {
        return (a)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)timerOuterClass$TimerMessage);
    }
    
    public static TimerOuterClass$TimerMessage parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, inputStream);
    }
    
    public static TimerOuterClass$TimerMessage parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, byteString);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final l l) throws IOException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, l);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final l l, final d0 d0) throws IOException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, l, d0);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final InputStream inputStream) throws IOException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, inputStream);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, array);
    }
    
    public static TimerOuterClass$TimerMessage parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (TimerOuterClass$TimerMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<TimerOuterClass$TimerMessage> parser() {
        return (n1<TimerOuterClass$TimerMessage>)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setDurationMillis(final int durationMillis_) {
        this.durationMillis_ = durationMillis_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (l90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<TimerOuterClass$TimerMessage> parser;
                if ((parser = TimerOuterClass$TimerMessage.PARSER) == null) {
                    synchronized (TimerOuterClass$TimerMessage.class) {
                        if (TimerOuterClass$TimerMessage.PARSER == null) {
                            TimerOuterClass$TimerMessage.PARSER = (n1<TimerOuterClass$TimerMessage>)new GeneratedMessageLite$c((GeneratedMessageLite)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return TimerOuterClass$TimerMessage.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)TimerOuterClass$TimerMessage.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[] { "durationMillis_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new TimerOuterClass$TimerMessage();
            }
        }
    }
    
    public int getDurationMillis() {
        return this.durationMillis_;
    }
    
    public static final class a extends GeneratedMessageLite$b<TimerOuterClass$TimerMessage, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)TimerOuterClass$TimerMessage.access$000());
        }
    }
}
