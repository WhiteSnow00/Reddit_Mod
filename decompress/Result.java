// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.NoWhenBranchMatchedException;
import sg2.e;
import rg2.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0012\u0013\u0014B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0000\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0086\b\u00f8\u0001\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0015\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/model/Result;", "T", "", "()V", "error", "", "getError", "()Ljava/lang/String;", "isSuccess", "", "()Z", "result", "getResult", "()Ljava/lang/Object;", "map", "R", "mapper", "Lkotlin/Function1;", "Error", "ErrorType", "Success", "Lcom/reddit/domain/model/Result$Error;", "Lcom/reddit/domain/model/Result$Success;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class Result<T>
{
    private Result() {
    }
    
    public abstract String getError();
    
    public abstract T getResult();
    
    public final boolean isSuccess() {
        return this.getError() == null;
    }
    
    public final <R> Result<R> map(final l<? super T, ? extends R> l) {
        e.f((Object)l, "mapper");
        Result<R> result;
        if (this instanceof Error) {
            result = (Result<R>)this;
        }
        else {
            if (!(this instanceof Success)) {
                throw new NoWhenBranchMatchedException();
            }
            result = new Success<R>((R)l.invoke(((Success)this).getResult()));
        }
        return result;
    }
    
    @Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0004H\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00018\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/Result$Error;", "T", "Lcom/reddit/domain/model/Result;", "error", "", "isTextError", "", "errorType", "Lcom/reddit/domain/model/Result$ErrorType;", "(Ljava/lang/String;ZLcom/reddit/domain/model/Result$ErrorType;)V", "getError", "()Ljava/lang/String;", "getErrorType", "()Lcom/reddit/domain/model/Result$ErrorType;", "()Z", "result", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Error<T> extends Result<T>
    {
        private final String error;
        private final ErrorType errorType;
        private final boolean isTextError;
        private final T result;
        
        public Error(final String error, final boolean isTextError, final ErrorType errorType) {
            e.f((Object)error, "error");
            e.f((Object)errorType, "errorType");
            super(null);
            this.error = error;
            this.isTextError = isTextError;
            this.errorType = errorType;
        }
        
        public final String component1() {
            return this.getError();
        }
        
        public final boolean component2() {
            return this.isTextError;
        }
        
        public final ErrorType component3() {
            return this.errorType;
        }
        
        public final Error<T> copy(final String s, final boolean b, final ErrorType errorType) {
            e.f((Object)s, "error");
            e.f((Object)errorType, "errorType");
            return new Error<T>(s, b, errorType);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Error)) {
                return false;
            }
            final Error error = (Error)o;
            return e.a((Object)this.getError(), (Object)error.getError()) && this.isTextError == error.isTextError && this.errorType == error.errorType;
        }
        
        @Override
        public String getError() {
            return this.error;
        }
        
        public final ErrorType getErrorType() {
            return this.errorType;
        }
        
        @Override
        public T getResult() {
            return this.result;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.getError().hashCode();
            int isTextError;
            if ((isTextError = (this.isTextError ? 1 : 0)) != 0) {
                isTextError = 1;
            }
            return this.errorType.hashCode() + (hashCode * 31 + isTextError) * 31;
        }
        
        public final boolean isTextError() {
            return this.isTextError;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("Error(error=");
            r.append(this.getError());
            r.append(", isTextError=");
            r.append(this.isTextError);
            r.append(", errorType=");
            r.append(this.errorType);
            r.append(')');
            return r.toString();
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/Result$ErrorType;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "CONNECTION", "SERVER", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum ErrorType
    {
        CONNECTION, 
        SERVER, 
        UNKNOWN;
    }
    
    @Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00028\u0001H\u00c6\u0003¢\u0006\u0002\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/model/Result$Success;", "T", "Lcom/reddit/domain/model/Result;", "result", "(Ljava/lang/Object;)V", "error", "", "getError", "()Ljava/lang/String;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/reddit/domain/model/Result$Success;", "equals", "", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Success<T> extends Result<T>
    {
        private final T result;
        
        public Success(final T result) {
            super(null);
            this.result = result;
        }
        
        public final T component1() {
            return this.getResult();
        }
        
        public final Success<T> copy(final T t) {
            return new Success<T>(t);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Success && e.a(this.getResult(), ((Success)o).getResult()));
        }
        
        @Override
        public String getError() {
            return null;
        }
        
        @Override
        public T getResult() {
            return this.result;
        }
        
        @Override
        public int hashCode() {
            int hashCode;
            if (this.getResult() == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.getResult().hashCode();
            }
            return hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("Success(result=");
            r.append(this.getResult());
            r.append(')');
            return r.toString();
        }
    }
}
