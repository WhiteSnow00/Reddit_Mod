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

public final class SubredditsMsg$UploadSrImgRequest extends GeneratedMessageLite<SubredditsMsg$UploadSrImgRequest, a> implements d1
{
    private static final SubredditsMsg$UploadSrImgRequest DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int IMG_TYPE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile n1<SubredditsMsg$UploadSrImgRequest> PARSER;
    public static final int SUBREDDIT_FIELD_NUMBER = 6;
    public static final int UPLOAD_TYPE_FIELD_NUMBER = 5;
    private String file_;
    private long header_;
    private String imgType_;
    private String name_;
    private String subreddit_;
    private String uploadType_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)SubredditsMsg$UploadSrImgRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new SubredditsMsg$UploadSrImgRequest()));
    }
    
    private SubredditsMsg$UploadSrImgRequest() {
        this.file_ = "";
        this.imgType_ = "";
        this.name_ = "";
        this.uploadType_ = "";
        this.subreddit_ = "";
    }
    
    public static SubredditsMsg$UploadSrImgRequest access$25700() {
        return SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$25800(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final String file) {
        subredditsMsg$UploadSrImgRequest.setFile(file);
    }
    
    public static void access$25900(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest) {
        subredditsMsg$UploadSrImgRequest.clearFile();
    }
    
    public static void access$26000(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final ByteString fileBytes) {
        subredditsMsg$UploadSrImgRequest.setFileBytes(fileBytes);
    }
    
    public static void access$26100(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final long header) {
        subredditsMsg$UploadSrImgRequest.setHeader(header);
    }
    
    public static void access$26200(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest) {
        subredditsMsg$UploadSrImgRequest.clearHeader();
    }
    
    public static void access$26300(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final String imgType) {
        subredditsMsg$UploadSrImgRequest.setImgType(imgType);
    }
    
    public static void access$26400(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest) {
        subredditsMsg$UploadSrImgRequest.clearImgType();
    }
    
    public static void access$26500(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final ByteString imgTypeBytes) {
        subredditsMsg$UploadSrImgRequest.setImgTypeBytes(imgTypeBytes);
    }
    
    public static void access$26600(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final String name) {
        subredditsMsg$UploadSrImgRequest.setName(name);
    }
    
    public static void access$26700(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest) {
        subredditsMsg$UploadSrImgRequest.clearName();
    }
    
    public static void access$26800(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final ByteString nameBytes) {
        subredditsMsg$UploadSrImgRequest.setNameBytes(nameBytes);
    }
    
    public static void access$26900(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final String uploadType) {
        subredditsMsg$UploadSrImgRequest.setUploadType(uploadType);
    }
    
    public static void access$27000(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest) {
        subredditsMsg$UploadSrImgRequest.clearUploadType();
    }
    
    public static void access$27100(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final ByteString uploadTypeBytes) {
        subredditsMsg$UploadSrImgRequest.setUploadTypeBytes(uploadTypeBytes);
    }
    
    public static void access$27200(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final String subreddit) {
        subredditsMsg$UploadSrImgRequest.setSubreddit(subreddit);
    }
    
    public static void access$27300(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest) {
        subredditsMsg$UploadSrImgRequest.clearSubreddit();
    }
    
    public static void access$27400(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest, final ByteString subredditBytes) {
        subredditsMsg$UploadSrImgRequest.setSubredditBytes(subredditBytes);
    }
    
    private void clearFile() {
        this.file_ = getDefaultInstance().getFile();
    }
    
    private void clearHeader() {
        this.header_ = 0L;
    }
    
    private void clearImgType() {
        this.imgType_ = getDefaultInstance().getImgType();
    }
    
    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }
    
    private void clearSubreddit() {
        this.subreddit_ = getDefaultInstance().getSubreddit();
    }
    
    private void clearUploadType() {
        this.uploadType_ = getDefaultInstance().getUploadType();
    }
    
    public static SubredditsMsg$UploadSrImgRequest getDefaultInstance() {
        return SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final SubredditsMsg$UploadSrImgRequest subredditsMsg$UploadSrImgRequest) {
        return (a)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)subredditsMsg$UploadSrImgRequest);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final l l) throws IOException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, l);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final InputStream inputStream) throws IOException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, array);
    }
    
    public static SubredditsMsg$UploadSrImgRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (SubredditsMsg$UploadSrImgRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<SubredditsMsg$UploadSrImgRequest> parser() {
        return (n1<SubredditsMsg$UploadSrImgRequest>)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setFile(final String file_) {
        file_.getClass();
        this.file_ = file_;
    }
    
    private void setFileBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.file_ = byteString.toStringUtf8();
    }
    
    private void setHeader(final long header_) {
        this.header_ = header_;
    }
    
    private void setImgType(final String imgType_) {
        imgType_.getClass();
        this.imgType_ = imgType_;
    }
    
    private void setImgTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.imgType_ = byteString.toStringUtf8();
    }
    
    private void setName(final String name_) {
        name_.getClass();
        this.name_ = name_;
    }
    
    private void setNameBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }
    
    private void setSubreddit(final String subreddit_) {
        subreddit_.getClass();
        this.subreddit_ = subreddit_;
    }
    
    private void setSubredditBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.subreddit_ = byteString.toStringUtf8();
    }
    
    private void setUploadType(final String uploadType_) {
        uploadType_.getClass();
        this.uploadType_ = uploadType_;
    }
    
    private void setUploadTypeBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.uploadType_ = byteString.toStringUtf8();
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
                final n1<SubredditsMsg$UploadSrImgRequest> parser;
                if ((parser = SubredditsMsg$UploadSrImgRequest.PARSER) == null) {
                    synchronized (SubredditsMsg$UploadSrImgRequest.class) {
                        if (SubredditsMsg$UploadSrImgRequest.PARSER == null) {
                            SubredditsMsg$UploadSrImgRequest.PARSER = (n1<SubredditsMsg$UploadSrImgRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)SubredditsMsg$UploadSrImgRequest.DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208", new Object[] { "file_", "header_", "imgType_", "name_", "uploadType_", "subreddit_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new SubredditsMsg$UploadSrImgRequest();
            }
        }
    }
    
    public String getFile() {
        return this.file_;
    }
    
    public ByteString getFileBytes() {
        return ByteString.copyFromUtf8(this.file_);
    }
    
    public long getHeader() {
        return this.header_;
    }
    
    public String getImgType() {
        return this.imgType_;
    }
    
    public ByteString getImgTypeBytes() {
        return ByteString.copyFromUtf8(this.imgType_);
    }
    
    public String getName() {
        return this.name_;
    }
    
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
    
    public String getSubreddit() {
        return this.subreddit_;
    }
    
    public ByteString getSubredditBytes() {
        return ByteString.copyFromUtf8(this.subreddit_);
    }
    
    public String getUploadType() {
        return this.uploadType_;
    }
    
    public ByteString getUploadTypeBytes() {
        return ByteString.copyFromUtf8(this.uploadType_);
    }
    
    public static final class a extends GeneratedMessageLite$b<SubredditsMsg$UploadSrImgRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)SubredditsMsg$UploadSrImgRequest.access$25700());
        }
    }
}
