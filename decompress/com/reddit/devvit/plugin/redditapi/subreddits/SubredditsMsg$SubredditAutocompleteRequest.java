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

public final class SubredditsMsg$SubredditAutocompleteRequest extends GeneratedMessageLite<SubredditsMsg$SubredditAutocompleteRequest, a> implements d1
{
    private static final SubredditsMsg$SubredditAutocompleteRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_OVER_18_FIELD_NUMBER = 1;
    public static final int INCLUDE_PROFILES_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 3;
    private static volatile n1<SubredditsMsg$SubredditAutocompleteRequest> PARSER;
    public static final int QUERY_FIELD_NUMBER = 4;
    public static final int SEARCH_QUERY_ID_FIELD_NUMBER = 5;
    public static final int TYPEAHEAD_ACTIVE_FIELD_NUMBER = 6;
    private boolean includeOver18_;
    private boolean includeProfiles_;
    private long limit_;
    private String query_;
    private String searchQueryId_;
    private boolean typeaheadActive_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$SubredditAutocompleteRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$SubredditAutocompleteRequest()));
    }
    
    private SubredditsMsg$SubredditAutocompleteRequest() {
        this.query_ = "";
        this.searchQueryId_ = "";
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest access$21100() {
        return SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$21200(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest, final boolean includeOver18) {
        subredditsMsg$SubredditAutocompleteRequest.setIncludeOver18(includeOver18);
    }
    
    public static void access$21300(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest) {
        subredditsMsg$SubredditAutocompleteRequest.clearIncludeOver18();
    }
    
    public static void access$21400(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest, final boolean includeProfiles) {
        subredditsMsg$SubredditAutocompleteRequest.setIncludeProfiles(includeProfiles);
    }
    
    public static void access$21500(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest) {
        subredditsMsg$SubredditAutocompleteRequest.clearIncludeProfiles();
    }
    
    public static void access$21600(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest, final long limit) {
        subredditsMsg$SubredditAutocompleteRequest.setLimit(limit);
    }
    
    public static void access$21700(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest) {
        subredditsMsg$SubredditAutocompleteRequest.clearLimit();
    }
    
    public static void access$21800(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest, final String query) {
        subredditsMsg$SubredditAutocompleteRequest.setQuery(query);
    }
    
    public static void access$21900(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest) {
        subredditsMsg$SubredditAutocompleteRequest.clearQuery();
    }
    
    public static void access$22000(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest, final ByteString queryBytes) {
        subredditsMsg$SubredditAutocompleteRequest.setQueryBytes(queryBytes);
    }
    
    public static void access$22100(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest, final String searchQueryId) {
        subredditsMsg$SubredditAutocompleteRequest.setSearchQueryId(searchQueryId);
    }
    
    public static void access$22200(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest) {
        subredditsMsg$SubredditAutocompleteRequest.clearSearchQueryId();
    }
    
    public static void access$22300(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest, final ByteString searchQueryIdBytes) {
        subredditsMsg$SubredditAutocompleteRequest.setSearchQueryIdBytes(searchQueryIdBytes);
    }
    
    public static void access$22400(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest, final boolean typeaheadActive) {
        subredditsMsg$SubredditAutocompleteRequest.setTypeaheadActive(typeaheadActive);
    }
    
    public static void access$22500(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest) {
        subredditsMsg$SubredditAutocompleteRequest.clearTypeaheadActive();
    }
    
    private void clearIncludeOver18() {
        this.includeOver18_ = false;
    }
    
    private void clearIncludeProfiles() {
        this.includeProfiles_ = false;
    }
    
    private void clearLimit() {
        this.limit_ = 0L;
    }
    
    private void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }
    
    private void clearSearchQueryId() {
        this.searchQueryId_ = getDefaultInstance().getSearchQueryId();
    }
    
    private void clearTypeaheadActive() {
        this.typeaheadActive_ = false;
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest getDefaultInstance() {
        return SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$SubredditAutocompleteRequest subredditsMsg$SubredditAutocompleteRequest) {
        return (a)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$SubredditAutocompleteRequest);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final l l) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$SubredditAutocompleteRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$SubredditAutocompleteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$SubredditAutocompleteRequest> parser() {
        return (n1<SubredditsMsg$SubredditAutocompleteRequest>)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setIncludeOver18(final boolean includeOver18_) {
        this.includeOver18_ = includeOver18_;
    }
    
    private void setIncludeProfiles(final boolean includeProfiles_) {
        this.includeProfiles_ = includeProfiles_;
    }
    
    private void setLimit(final long limit_) {
        this.limit_ = limit_;
    }
    
    private void setQuery(final String query_) {
        query_.getClass();
        this.query_ = query_;
    }
    
    private void setQueryBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.query_ = byteString.toStringUtf8();
    }
    
    private void setSearchQueryId(final String searchQueryId_) {
        searchQueryId_.getClass();
        this.searchQueryId_ = searchQueryId_;
    }
    
    private void setSearchQueryIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.searchQueryId_ = byteString.toStringUtf8();
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
                final n1<SubredditsMsg$SubredditAutocompleteRequest> parser;
                if ((parser = SubredditsMsg$SubredditAutocompleteRequest.PARSER) == null) {
                    synchronized (SubredditsMsg$SubredditAutocompleteRequest.class) {
                        if (SubredditsMsg$SubredditAutocompleteRequest.PARSER == null) {
                            SubredditsMsg$SubredditAutocompleteRequest.PARSER = (n1<SubredditsMsg$SubredditAutocompleteRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$SubredditAutocompleteRequest.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0007", new Object[] { "includeOver18_", "includeProfiles_", "limit_", "query_", "searchQueryId_", "typeaheadActive_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$SubredditAutocompleteRequest();
            }
        }
    }
    
    public boolean getIncludeOver18() {
        return this.includeOver18_;
    }
    
    public boolean getIncludeProfiles() {
        return this.includeProfiles_;
    }
    
    public long getLimit() {
        return this.limit_;
    }
    
    public String getQuery() {
        return this.query_;
    }
    
    public ByteString getQueryBytes() {
        return ByteString.copyFromUtf8(this.query_);
    }
    
    public String getSearchQueryId() {
        return this.searchQueryId_;
    }
    
    public ByteString getSearchQueryIdBytes() {
        return ByteString.copyFromUtf8(this.searchQueryId_);
    }
    
    public boolean getTypeaheadActive() {
        return this.typeaheadActive_;
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$SubredditAutocompleteRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$SubredditAutocompleteRequest.access$21100());
        }
    }
}
