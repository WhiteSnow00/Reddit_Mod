// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.users;

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

public final class UsersMsg$UserWhereRequest extends GeneratedMessageLite<UsersMsg$UserWhereRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 6;
    public static final int BEFORE_FIELD_NUMBER = 7;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    public static final int COUNT_FIELD_NUMBER = 8;
    private static final UsersMsg$UserWhereRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 9;
    private static volatile n1<UsersMsg$UserWhereRequest> PARSER;
    public static final int SHOW_FIELD_NUMBER = 2;
    public static final int SORT_FIELD_NUMBER = 3;
    public static final int SR_DETAIL_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int T_FIELD_NUMBER = 4;
    public static final int USERNAME_FIELD_NUMBER = 11;
    public static final int WHERE_FIELD_NUMBER = 12;
    private String after_;
    private String before_;
    private int context_;
    private long count_;
    private int limit_;
    private String show_;
    private String sort_;
    private boolean srDetail_;
    private String t_;
    private String type_;
    private String username_;
    private String where_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)UsersMsg$UserWhereRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new UsersMsg$UserWhereRequest()));
    }
    
    private UsersMsg$UserWhereRequest() {
        this.show_ = "";
        this.sort_ = "";
        this.t_ = "";
        this.type_ = "";
        this.after_ = "";
        this.before_ = "";
        this.username_ = "";
        this.where_ = "";
    }
    
    public static /* synthetic */ UsersMsg$UserWhereRequest access$10600() {
        return UsersMsg$UserWhereRequest.DEFAULT_INSTANCE;
    }
    
    private void clearAfter() {
        this.after_ = getDefaultInstance().getAfter();
    }
    
    private void clearBefore() {
        this.before_ = getDefaultInstance().getBefore();
    }
    
    private void clearContext() {
        this.context_ = 0;
    }
    
    private void clearCount() {
        this.count_ = 0L;
    }
    
    private void clearLimit() {
        this.limit_ = 0;
    }
    
    private void clearShow() {
        this.show_ = getDefaultInstance().getShow();
    }
    
    private void clearSort() {
        this.sort_ = getDefaultInstance().getSort();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    private void clearT() {
        this.t_ = getDefaultInstance().getT();
    }
    
    private void clearType() {
        this.type_ = getDefaultInstance().getType();
    }
    
    private void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }
    
    private void clearWhere() {
        this.where_ = getDefaultInstance().getWhere();
    }
    
    public static UsersMsg$UserWhereRequest getDefaultInstance() {
        return UsersMsg$UserWhereRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final UsersMsg$UserWhereRequest usersMsg$UserWhereRequest) {
        return (a)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usersMsg$UserWhereRequest);
    }
    
    public static UsersMsg$UserWhereRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserWhereRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final l l) throws IOException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, l);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final InputStream inputStream) throws IOException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, array);
    }
    
    public static UsersMsg$UserWhereRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (UsersMsg$UserWhereRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<UsersMsg$UserWhereRequest> parser() {
        return (n1<UsersMsg$UserWhereRequest>)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAfter(final String after_) {
        after_.getClass();
        this.after_ = after_;
    }
    
    private void setAfterBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.after_ = byteString.toStringUtf8();
    }
    
    private void setBefore(final String before_) {
        before_.getClass();
        this.before_ = before_;
    }
    
    private void setBeforeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.before_ = byteString.toStringUtf8();
    }
    
    private void setContext(final int context_) {
        this.context_ = context_;
    }
    
    private void setCount(final long count_) {
        this.count_ = count_;
    }
    
    private void setLimit(final int limit_) {
        this.limit_ = limit_;
    }
    
    private void setShow(final String show_) {
        show_.getClass();
        this.show_ = show_;
    }
    
    private void setShowBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.show_ = byteString.toStringUtf8();
    }
    
    private void setSort(final String sort_) {
        sort_.getClass();
        this.sort_ = sort_;
    }
    
    private void setSortBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.sort_ = byteString.toStringUtf8();
    }
    
    private void setSrDetail(final boolean srDetail_) {
        this.srDetail_ = srDetail_;
    }
    
    private void setT(final String t_) {
        t_.getClass();
        this.t_ = t_;
    }
    
    private void setTBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.t_ = byteString.toStringUtf8();
    }
    
    private void setType(final String type_) {
        type_.getClass();
        this.type_ = type_;
    }
    
    private void setTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }
    
    private void setUsername(final String username_) {
        username_.getClass();
        this.username_ = username_;
    }
    
    private void setUsernameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.username_ = byteString.toStringUtf8();
    }
    
    private void setWhere(final String where_) {
        where_.getClass();
        this.where_ = where_;
    }
    
    private void setWhereBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.where_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (i90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<UsersMsg$UserWhereRequest> parser;
                if ((parser = UsersMsg$UserWhereRequest.PARSER) == null) {
                    synchronized (UsersMsg$UserWhereRequest.class) {
                        if (UsersMsg$UserWhereRequest.PARSER == null) {
                            UsersMsg$UserWhereRequest.PARSER = (n1<UsersMsg$UserWhereRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return UsersMsg$UserWhereRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)UsersMsg$UserWhereRequest.DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0002\t\u0004\n\u0007\u000b\u0208\f\u0208", new Object[] { "context_", "show_", "sort_", "t_", "type_", "after_", "before_", "count_", "limit_", "srDetail_", "username_", "where_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new UsersMsg$UserWhereRequest();
            }
        }
    }
    
    public String getAfter() {
        return this.after_;
    }
    
    public ByteString getAfterBytes() {
        return ByteString.copyFromUtf8(this.after_);
    }
    
    public String getBefore() {
        return this.before_;
    }
    
    public ByteString getBeforeBytes() {
        return ByteString.copyFromUtf8(this.before_);
    }
    
    public int getContext() {
        return this.context_;
    }
    
    public long getCount() {
        return this.count_;
    }
    
    public int getLimit() {
        return this.limit_;
    }
    
    public String getShow() {
        return this.show_;
    }
    
    public ByteString getShowBytes() {
        return ByteString.copyFromUtf8(this.show_);
    }
    
    public String getSort() {
        return this.sort_;
    }
    
    public ByteString getSortBytes() {
        return ByteString.copyFromUtf8(this.sort_);
    }
    
    public boolean getSrDetail() {
        return this.srDetail_;
    }
    
    public String getT() {
        return this.t_;
    }
    
    public ByteString getTBytes() {
        return ByteString.copyFromUtf8(this.t_);
    }
    
    public String getType() {
        return this.type_;
    }
    
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }
    
    public String getUsername() {
        return this.username_;
    }
    
    public ByteString getUsernameBytes() {
        return ByteString.copyFromUtf8(this.username_);
    }
    
    public String getWhere() {
        return this.where_;
    }
    
    public ByteString getWhereBytes() {
        return ByteString.copyFromUtf8(this.where_);
    }
    
    public static final class a extends GeneratedMessageLite$b<UsersMsg$UserWhereRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)UsersMsg$UserWhereRequest.access$10600());
        }
    }
}
