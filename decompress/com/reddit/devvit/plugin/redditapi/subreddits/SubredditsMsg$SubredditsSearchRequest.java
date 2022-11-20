// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.subreddits;

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

public final class SubredditsMsg$SubredditsSearchRequest extends GeneratedMessageLite<SubredditsMsg$SubredditsSearchRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 1;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final SubredditsMsg$SubredditsSearchRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    private static volatile n1<SubredditsMsg$SubredditsSearchRequest> PARSER;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int SEARCH_QUERY_ID_FIELD_NUMBER = 6;
    public static final int SHOW_FIELD_NUMBER = 7;
    public static final int SHOW_USERS_FIELD_NUMBER = 8;
    public static final int SORT_FIELD_NUMBER = 9;
    public static final int SR_DETAIL_FIELD_NUMBER = 10;
    public static final int TYPEAHEAD_ACTIVE_FIELD_NUMBER = 11;
    private String after_;
    private String before_;
    private long count_;
    private long limit_;
    private String q_;
    private String searchQueryId_;
    private boolean showUsers_;
    private String show_;
    private String sort_;
    private boolean srDetail_;
    private boolean typeaheadActive_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditsSearchRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditsSearchRequest()));
    }
    
    private SubredditsMsg$SubredditsSearchRequest() {
        this.after_ = "";
        this.before_ = "";
        this.q_ = "";
        this.searchQueryId_ = "";
        this.show_ = "";
        this.sort_ = "";
    }
    
    public static SubredditsMsg$SubredditsSearchRequest access$31400() {
        return SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$31500(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final String after) {
        subredditsMsg$SubredditsSearchRequest.setAfter(after);
    }
    
    public static void access$31600(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearAfter();
    }
    
    public static void access$31700(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final ByteString afterBytes) {
        subredditsMsg$SubredditsSearchRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$31800(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final String before) {
        subredditsMsg$SubredditsSearchRequest.setBefore(before);
    }
    
    public static void access$31900(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearBefore();
    }
    
    public static void access$32000(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final ByteString beforeBytes) {
        subredditsMsg$SubredditsSearchRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$32100(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final long count) {
        subredditsMsg$SubredditsSearchRequest.setCount(count);
    }
    
    public static void access$32200(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearCount();
    }
    
    public static void access$32300(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final long limit) {
        subredditsMsg$SubredditsSearchRequest.setLimit(limit);
    }
    
    public static void access$32400(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearLimit();
    }
    
    public static void access$32500(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final String q) {
        subredditsMsg$SubredditsSearchRequest.setQ(q);
    }
    
    public static void access$32600(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearQ();
    }
    
    public static void access$32700(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final ByteString qBytes) {
        subredditsMsg$SubredditsSearchRequest.setQBytes(qBytes);
    }
    
    public static void access$32800(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final String searchQueryId) {
        subredditsMsg$SubredditsSearchRequest.setSearchQueryId(searchQueryId);
    }
    
    public static void access$32900(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearSearchQueryId();
    }
    
    public static void access$33000(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final ByteString searchQueryIdBytes) {
        subredditsMsg$SubredditsSearchRequest.setSearchQueryIdBytes(searchQueryIdBytes);
    }
    
    public static void access$33100(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final String show) {
        subredditsMsg$SubredditsSearchRequest.setShow(show);
    }
    
    public static void access$33200(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearShow();
    }
    
    public static void access$33300(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final ByteString showBytes) {
        subredditsMsg$SubredditsSearchRequest.setShowBytes(showBytes);
    }
    
    public static void access$33400(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final boolean showUsers) {
        subredditsMsg$SubredditsSearchRequest.setShowUsers(showUsers);
    }
    
    public static void access$33500(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearShowUsers();
    }
    
    public static void access$33600(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final String sort) {
        subredditsMsg$SubredditsSearchRequest.setSort(sort);
    }
    
    public static void access$33700(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearSort();
    }
    
    public static void access$33800(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final ByteString sortBytes) {
        subredditsMsg$SubredditsSearchRequest.setSortBytes(sortBytes);
    }
    
    public static void access$33900(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final boolean srDetail) {
        subredditsMsg$SubredditsSearchRequest.setSrDetail(srDetail);
    }
    
    public static void access$34000(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearSrDetail();
    }
    
    public static void access$34100(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest, final boolean typeaheadActive) {
        subredditsMsg$SubredditsSearchRequest.setTypeaheadActive(typeaheadActive);
    }
    
    public static void access$34200(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        subredditsMsg$SubredditsSearchRequest.clearTypeaheadActive();
    }
    
    private void clearAfter() {
        this.after_ = getDefaultInstance().getAfter();
    }
    
    private void clearBefore() {
        this.before_ = getDefaultInstance().getBefore();
    }
    
    private void clearCount() {
        this.count_ = 0L;
    }
    
    private void clearLimit() {
        this.limit_ = 0L;
    }
    
    private void clearQ() {
        this.q_ = getDefaultInstance().getQ();
    }
    
    private void clearSearchQueryId() {
        this.searchQueryId_ = getDefaultInstance().getSearchQueryId();
    }
    
    private void clearShow() {
        this.show_ = getDefaultInstance().getShow();
    }
    
    private void clearShowUsers() {
        this.showUsers_ = false;
    }
    
    private void clearSort() {
        this.sort_ = getDefaultInstance().getSort();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    private void clearTypeaheadActive() {
        this.typeaheadActive_ = false;
    }
    
    public static SubredditsMsg$SubredditsSearchRequest getDefaultInstance() {
        return SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditsSearchRequest subredditsMsg$SubredditsSearchRequest) {
        return (a)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditsSearchRequest);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditsSearchRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditsSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditsSearchRequest> parser() {
        return (n1<SubredditsMsg$SubredditsSearchRequest>)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE.getParserForType();
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
    
    private void setCount(final long count_) {
        this.count_ = count_;
    }
    
    private void setLimit(final long limit_) {
        this.limit_ = limit_;
    }
    
    private void setQ(final String q_) {
        q_.getClass();
        this.q_ = q_;
    }
    
    private void setQBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.q_ = byteString.toStringUtf8();
    }
    
    private void setSearchQueryId(final String searchQueryId_) {
        searchQueryId_.getClass();
        this.searchQueryId_ = searchQueryId_;
    }
    
    private void setSearchQueryIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.searchQueryId_ = byteString.toStringUtf8();
    }
    
    private void setShow(final String show_) {
        show_.getClass();
        this.show_ = show_;
    }
    
    private void setShowBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.show_ = byteString.toStringUtf8();
    }
    
    private void setShowUsers(final boolean showUsers_) {
        this.showUsers_ = showUsers_;
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
    
    private void setTypeaheadActive(final boolean typeaheadActive_) {
        this.typeaheadActive_ = typeaheadActive_;
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (h90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<SubredditsMsg$SubredditsSearchRequest> parser;
                if ((parser = SubredditsMsg$SubredditsSearchRequest.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditsSearchRequest.class) {
                        if (SubredditsMsg$SubredditsSearchRequest.PARSER == null) {
                            SubredditsMsg$SubredditsSearchRequest.PARSER = (n1<SubredditsMsg$SubredditsSearchRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditsSearchRequest.DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u0208\b\u0007\t\u0208\n\u0007\u000b\u0007", new Object[] { "after_", "before_", "count_", "limit_", "q_", "searchQueryId_", "show_", "showUsers_", "sort_", "srDetail_", "typeaheadActive_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditsSearchRequest();
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
    
    public long getCount() {
        return this.count_;
    }
    
    public long getLimit() {
        return this.limit_;
    }
    
    public String getQ() {
        return this.q_;
    }
    
    public ByteString getQBytes() {
        return ByteString.copyFromUtf8(this.q_);
    }
    
    public String getSearchQueryId() {
        return this.searchQueryId_;
    }
    
    public ByteString getSearchQueryIdBytes() {
        return ByteString.copyFromUtf8(this.searchQueryId_);
    }
    
    public String getShow() {
        return this.show_;
    }
    
    public ByteString getShowBytes() {
        return ByteString.copyFromUtf8(this.show_);
    }
    
    public boolean getShowUsers() {
        return this.showUsers_;
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
    
    public boolean getTypeaheadActive() {
        return this.typeaheadActive_;
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditsSearchRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditsSearchRequest.access$31400());
        }
    }
}
