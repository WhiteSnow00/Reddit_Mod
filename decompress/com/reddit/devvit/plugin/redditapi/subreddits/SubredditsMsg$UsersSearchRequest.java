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

public final class SubredditsMsg$UsersSearchRequest extends GeneratedMessageLite<SubredditsMsg$UsersSearchRequest, a> implements d1
{
    public static final int AFTER_FIELD_NUMBER = 1;
    public static final int BEFORE_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final SubredditsMsg$UsersSearchRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    private static volatile n1<SubredditsMsg$UsersSearchRequest> PARSER;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int SEARCH_QUERY_ID_FIELD_NUMBER = 6;
    public static final int SHOW_FIELD_NUMBER = 7;
    public static final int SORT_FIELD_NUMBER = 8;
    public static final int SR_DETAIL_FIELD_NUMBER = 9;
    public static final int TYPEAHEAD_ACTIVE_FIELD_NUMBER = 10;
    private String after_;
    private String before_;
    private long count_;
    private long limit_;
    private String q_;
    private String searchQueryId_;
    private String show_;
    private String sort_;
    private boolean srDetail_;
    private boolean typeaheadActive_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$UsersSearchRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$UsersSearchRequest()));
    }
    
    private SubredditsMsg$UsersSearchRequest() {
        this.after_ = "";
        this.before_ = "";
        this.q_ = "";
        this.searchQueryId_ = "";
        this.show_ = "";
        this.sort_ = "";
    }
    
    public static SubredditsMsg$UsersSearchRequest access$34400() {
        return SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$34500(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final String after) {
        subredditsMsg$UsersSearchRequest.setAfter(after);
    }
    
    public static void access$34600(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearAfter();
    }
    
    public static void access$34700(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final ByteString afterBytes) {
        subredditsMsg$UsersSearchRequest.setAfterBytes(afterBytes);
    }
    
    public static void access$34800(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final String before) {
        subredditsMsg$UsersSearchRequest.setBefore(before);
    }
    
    public static void access$34900(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearBefore();
    }
    
    public static void access$35000(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final ByteString beforeBytes) {
        subredditsMsg$UsersSearchRequest.setBeforeBytes(beforeBytes);
    }
    
    public static void access$35100(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final long count) {
        subredditsMsg$UsersSearchRequest.setCount(count);
    }
    
    public static void access$35200(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearCount();
    }
    
    public static void access$35300(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final long limit) {
        subredditsMsg$UsersSearchRequest.setLimit(limit);
    }
    
    public static void access$35400(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearLimit();
    }
    
    public static void access$35500(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final String q) {
        subredditsMsg$UsersSearchRequest.setQ(q);
    }
    
    public static void access$35600(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearQ();
    }
    
    public static void access$35700(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final ByteString qBytes) {
        subredditsMsg$UsersSearchRequest.setQBytes(qBytes);
    }
    
    public static void access$35800(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final String searchQueryId) {
        subredditsMsg$UsersSearchRequest.setSearchQueryId(searchQueryId);
    }
    
    public static void access$35900(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearSearchQueryId();
    }
    
    public static void access$36000(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final ByteString searchQueryIdBytes) {
        subredditsMsg$UsersSearchRequest.setSearchQueryIdBytes(searchQueryIdBytes);
    }
    
    public static void access$36100(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final String show) {
        subredditsMsg$UsersSearchRequest.setShow(show);
    }
    
    public static void access$36200(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearShow();
    }
    
    public static void access$36300(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final ByteString showBytes) {
        subredditsMsg$UsersSearchRequest.setShowBytes(showBytes);
    }
    
    public static void access$36400(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final String sort) {
        subredditsMsg$UsersSearchRequest.setSort(sort);
    }
    
    public static void access$36500(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearSort();
    }
    
    public static void access$36600(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final ByteString sortBytes) {
        subredditsMsg$UsersSearchRequest.setSortBytes(sortBytes);
    }
    
    public static void access$36700(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final boolean srDetail) {
        subredditsMsg$UsersSearchRequest.setSrDetail(srDetail);
    }
    
    public static void access$36800(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearSrDetail();
    }
    
    public static void access$36900(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest, final boolean typeaheadActive) {
        subredditsMsg$UsersSearchRequest.setTypeaheadActive(typeaheadActive);
    }
    
    public static void access$37000(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        subredditsMsg$UsersSearchRequest.clearTypeaheadActive();
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
    
    private void clearSort() {
        this.sort_ = getDefaultInstance().getSort();
    }
    
    private void clearSrDetail() {
        this.srDetail_ = false;
    }
    
    private void clearTypeaheadActive() {
        this.typeaheadActive_ = false;
    }
    
    public static SubredditsMsg$UsersSearchRequest getDefaultInstance() {
        return SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$UsersSearchRequest subredditsMsg$UsersSearchRequest) {
        return (a)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$UsersSearchRequest);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final l l) throws IOException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$UsersSearchRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UsersSearchRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$UsersSearchRequest> parser() {
        return (n1<SubredditsMsg$UsersSearchRequest>)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE.getParserForType();
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
                final n1<SubredditsMsg$UsersSearchRequest> parser;
                if ((parser = SubredditsMsg$UsersSearchRequest.PARSER) == null) {
                    synchronized (SubredditsMsg$UsersSearchRequest.class) {
                        if (SubredditsMsg$UsersSearchRequest.PARSER == null) {
                            SubredditsMsg$UsersSearchRequest.PARSER = (n1<SubredditsMsg$UsersSearchRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$UsersSearchRequest.DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0007\n\u0007", new Object[] { "after_", "before_", "count_", "limit_", "q_", "searchQueryId_", "show_", "sort_", "srDetail_", "typeaheadActive_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$UsersSearchRequest();
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
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$UsersSearchRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$UsersSearchRequest.access$34400());
        }
    }
}
