// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import al0.f0;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f" }, d2 = { "Lcom/reddit/domain/model/SubmitPostResult;", "T", "", "()V", "MediaPostCreating", "PostCreated", "SubmitError", "Success", "ValidationError", "Lcom/reddit/domain/model/SubmitPostResult$SubmitError;", "Lcom/reddit/domain/model/SubmitPostResult$Success;", "Lcom/reddit/domain/model/SubmitPostResult$ValidationError;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class SubmitPostResult<T>
{
    private SubmitPostResult() {
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/model/SubmitPostResult$MediaPostCreating;", "", "websocketUrl", "", "(Ljava/lang/String;)V", "getWebsocketUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class MediaPostCreating
    {
        private final String websocketUrl;
        
        public MediaPostCreating(final String websocketUrl) {
            e.f((Object)websocketUrl, "websocketUrl");
            this.websocketUrl = websocketUrl;
        }
        
        public final String component1() {
            return this.websocketUrl;
        }
        
        public final MediaPostCreating copy(final String s) {
            e.f((Object)s, "websocketUrl");
            return new MediaPostCreating(s);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof MediaPostCreating && e.a((Object)this.websocketUrl, (Object)((MediaPostCreating)o).websocketUrl));
        }
        
        public final String getWebsocketUrl() {
            return this.websocketUrl;
        }
        
        @Override
        public int hashCode() {
            return this.websocketUrl.hashCode();
        }
        
        @Override
        public String toString() {
            return f0.n(a.r("MediaPostCreating(websocketUrl="), this.websocketUrl, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/model/SubmitPostResult$PostCreated;", "", "postId", "", "(Ljava/lang/String;)V", "getPostId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class PostCreated
    {
        private final String postId;
        
        public PostCreated(final String postId) {
            e.f((Object)postId, "postId");
            this.postId = postId;
        }
        
        public final String component1() {
            return this.postId;
        }
        
        public final PostCreated copy(final String s) {
            e.f((Object)s, "postId");
            return new PostCreated(s);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof PostCreated && e.a((Object)this.postId, (Object)((PostCreated)o).postId));
        }
        
        public final String getPostId() {
            return this.postId;
        }
        
        @Override
        public int hashCode() {
            return this.postId.hashCode();
        }
        
        @Override
        public String toString() {
            return f0.n(a.r("PostCreated(postId="), this.postId, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/model/SubmitPostResult$SubmitError;", "T", "Lcom/reddit/domain/model/SubmitPostResult;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SubmitError<T> extends SubmitPostResult<T>
    {
        private final String error;
        
        public SubmitError(final String error) {
            e.f((Object)error, "error");
            super(null);
            this.error = error;
        }
        
        public final String component1() {
            return this.error;
        }
        
        public final SubmitError<T> copy(final String s) {
            e.f((Object)s, "error");
            return new SubmitError<T>(s);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof SubmitError && e.a((Object)this.error, (Object)((SubmitError)o).error));
        }
        
        public final String getError() {
            return this.error;
        }
        
        @Override
        public int hashCode() {
            return this.error.hashCode();
        }
        
        @Override
        public String toString() {
            return f0.n(a.r("SubmitError(error="), this.error, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/model/SubmitPostResult$Success;", "T", "Lcom/reddit/domain/model/SubmitPostResult;", "result", "(Ljava/lang/Object;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/reddit/domain/model/SubmitPostResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Success<T> extends SubmitPostResult<T>
    {
        private final T result;
        
        public Success(final T result) {
            super(null);
            this.result = result;
        }
        
        public final T component1() {
            return this.result;
        }
        
        public final Success<T> copy(final T t) {
            return new Success<T>(t);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Success && e.a((Object)this.result, (Object)((Success)o).result));
        }
        
        public final T getResult() {
            return this.result;
        }
        
        @Override
        public int hashCode() {
            final T result = this.result;
            int hashCode;
            if (result == null) {
                hashCode = 0;
            }
            else {
                hashCode = result.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public String toString() {
            return wu.a.b(a.r("Success(result="), (Object)this.result, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/model/SubmitPostResult$ValidationError;", "T", "Lcom/reddit/domain/model/SubmitPostResult;", "postSubmitValidationErrors", "Lcom/reddit/domain/model/PostSubmitValidationErrors;", "(Lcom/reddit/domain/model/PostSubmitValidationErrors;)V", "getPostSubmitValidationErrors", "()Lcom/reddit/domain/model/PostSubmitValidationErrors;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class ValidationError<T> extends SubmitPostResult<T>
    {
        private final PostSubmitValidationErrors postSubmitValidationErrors;
        
        public ValidationError(final PostSubmitValidationErrors postSubmitValidationErrors) {
            e.f((Object)postSubmitValidationErrors, "postSubmitValidationErrors");
            super(null);
            this.postSubmitValidationErrors = postSubmitValidationErrors;
        }
        
        public final PostSubmitValidationErrors component1() {
            return this.postSubmitValidationErrors;
        }
        
        public final ValidationError<T> copy(final PostSubmitValidationErrors postSubmitValidationErrors) {
            e.f((Object)postSubmitValidationErrors, "postSubmitValidationErrors");
            return new ValidationError<T>(postSubmitValidationErrors);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof ValidationError && e.a((Object)this.postSubmitValidationErrors, (Object)((ValidationError)o).postSubmitValidationErrors));
        }
        
        public final PostSubmitValidationErrors getPostSubmitValidationErrors() {
            return this.postSubmitValidationErrors;
        }
        
        @Override
        public int hashCode() {
            return this.postSubmitValidationErrors.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("ValidationError(postSubmitValidationErrors=");
            r.append(this.postSubmitValidationErrors);
            r.append(')');
            return r.toString();
        }
    }
}
