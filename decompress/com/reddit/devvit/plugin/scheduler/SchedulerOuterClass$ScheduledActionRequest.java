// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.scheduler;

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
import com.google.protobuf.Timestamp$b;
import com.reddit.devvit.actor.scheduler.Action$ScheduledAction$a;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.reddit.devvit.actor.scheduler.Action$ScheduledAction;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class SchedulerOuterClass$ScheduledActionRequest extends GeneratedMessageLite<SchedulerOuterClass$ScheduledActionRequest, a> implements d1
{
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int CRON_FIELD_NUMBER = 2;
    private static final SchedulerOuterClass$ScheduledActionRequest DEFAULT_INSTANCE;
    private static volatile n1<SchedulerOuterClass$ScheduledActionRequest> PARSER;
    public static final int WHEN_FIELD_NUMBER = 1;
    private Action$ScheduledAction action_;
    private int scheduleCase_;
    private Object schedule_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SchedulerOuterClass$ScheduledActionRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SchedulerOuterClass$ScheduledActionRequest()));
    }
    
    private SchedulerOuterClass$ScheduledActionRequest() {
        this.scheduleCase_ = 0;
    }
    
    public static /* synthetic */ SchedulerOuterClass$ScheduledActionRequest access$000() {
        return SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE;
    }
    
    private void clearAction() {
        this.action_ = null;
    }
    
    private void clearCron() {
        if (this.scheduleCase_ == 2) {
            this.scheduleCase_ = 0;
            this.schedule_ = null;
        }
    }
    
    private void clearSchedule() {
        this.scheduleCase_ = 0;
        this.schedule_ = null;
    }
    
    private void clearWhen() {
        if (this.scheduleCase_ == 1) {
            this.scheduleCase_ = 0;
            this.schedule_ = null;
        }
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest getDefaultInstance() {
        return SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE;
    }
    
    private void mergeAction(final Action$ScheduledAction action_) {
        action_.getClass();
        final Action$ScheduledAction action_2 = this.action_;
        if (action_2 != null && action_2 != Action$ScheduledAction.getDefaultInstance()) {
            final Action$ScheduledAction$a builder = Action$ScheduledAction.newBuilder(this.action_);
            ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)action_);
            this.action_ = (Action$ScheduledAction)((GeneratedMessageLite$b)builder).d();
        }
        else {
            this.action_ = action_;
        }
    }
    
    private void mergeWhen(final Timestamp schedule_) {
        schedule_.getClass();
        if (this.scheduleCase_ == 1 && this.schedule_ != Timestamp.getDefaultInstance()) {
            final Timestamp$b builder = Timestamp.newBuilder((Timestamp)this.schedule_);
            ((GeneratedMessageLite$b)builder).h((GeneratedMessageLite)schedule_);
            this.schedule_ = ((GeneratedMessageLite$b)builder).d();
        }
        else {
            this.schedule_ = schedule_;
        }
        this.scheduleCase_ = 1;
    }
    
    public static a newBuilder() {
        return (a)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SchedulerOuterClass$ScheduledActionRequest schedulerOuterClass$ScheduledActionRequest) {
        return (a)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)schedulerOuterClass$ScheduledActionRequest);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final l l) throws IOException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SchedulerOuterClass$ScheduledActionRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SchedulerOuterClass$ScheduledActionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SchedulerOuterClass$ScheduledActionRequest> parser() {
        return (n1<SchedulerOuterClass$ScheduledActionRequest>)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAction(final Action$ScheduledAction action_) {
        action_.getClass();
        this.action_ = action_;
    }
    
    private void setCron(final String schedule_) {
        schedule_.getClass();
        this.scheduleCase_ = 2;
        this.schedule_ = schedule_;
    }
    
    private void setCronBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.schedule_ = byteString.toStringUtf8();
        this.scheduleCase_ = 2;
    }
    
    private void setWhen(final Timestamp schedule_) {
        schedule_.getClass();
        this.schedule_ = schedule_;
        this.scheduleCase_ = 1;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (j90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<SchedulerOuterClass$ScheduledActionRequest> parser;
                if ((parser = SchedulerOuterClass$ScheduledActionRequest.PARSER) == null) {
                    synchronized (SchedulerOuterClass$ScheduledActionRequest.class) {
                        if (SchedulerOuterClass$ScheduledActionRequest.PARSER == null) {
                            SchedulerOuterClass$ScheduledActionRequest.PARSER = (n1<SchedulerOuterClass$ScheduledActionRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SchedulerOuterClass$ScheduledActionRequest.DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\u023b\u0000\u0003\t", new Object[] { "schedule_", "scheduleCase_", Timestamp.class, "action_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SchedulerOuterClass$ScheduledActionRequest();
            }
        }
    }
    
    public Action$ScheduledAction getAction() {
        Action$ScheduledAction action$ScheduledAction;
        if ((action$ScheduledAction = this.action_) == null) {
            action$ScheduledAction = Action$ScheduledAction.getDefaultInstance();
        }
        return action$ScheduledAction;
    }
    
    public String getCron() {
        String s;
        if (this.scheduleCase_ == 2) {
            s = (String)this.schedule_;
        }
        else {
            s = "";
        }
        return s;
    }
    
    public ByteString getCronBytes() {
        String s;
        if (this.scheduleCase_ == 2) {
            s = (String)this.schedule_;
        }
        else {
            s = "";
        }
        return ByteString.copyFromUtf8(s);
    }
    
    public SchedulerOuterClass$ScheduledActionRequest.SchedulerOuterClass$ScheduledActionRequest$ScheduleCase getScheduleCase() {
        return SchedulerOuterClass$ScheduledActionRequest.SchedulerOuterClass$ScheduledActionRequest$ScheduleCase.forNumber(this.scheduleCase_);
    }
    
    public Timestamp getWhen() {
        if (this.scheduleCase_ == 1) {
            return (Timestamp)this.schedule_;
        }
        return Timestamp.getDefaultInstance();
    }
    
    public boolean hasAction() {
        return this.action_ != null;
    }
    
    public boolean hasCron() {
        return this.scheduleCase_ == 2;
    }
    
    public boolean hasWhen() {
        final int scheduleCase_ = this.scheduleCase_;
        boolean b = true;
        if (scheduleCase_ != 1) {
            b = false;
        }
        return b;
    }
    
    public static final class a extends GeneratedMessageLite$b<SchedulerOuterClass$ScheduledActionRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SchedulerOuterClass$ScheduledActionRequest.access$000());
        }
    }
}
