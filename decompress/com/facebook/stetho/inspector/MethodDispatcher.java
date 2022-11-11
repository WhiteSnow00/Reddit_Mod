// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector;

import com.facebook.stetho.inspector.jsonrpc.protocol.EmptyResult;
import al0.b;
import java.lang.reflect.InvocationTargetException;
import com.facebook.stetho.common.ExceptionUtil;
import org.json.JSONException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import org.json.JSONObject;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.lang.annotation.Annotation;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.json.ObjectMapper;
import java.util.Map;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

public class MethodDispatcher
{
    private final Iterable<ChromeDevtoolsDomain> mDomainHandlers;
    private Map<String, MethodDispatchHelper> mMethods;
    private final ObjectMapper mObjectMapper;
    
    public MethodDispatcher(final ObjectMapper mObjectMapper, final Iterable<ChromeDevtoolsDomain> mDomainHandlers) {
        this.mObjectMapper = mObjectMapper;
        this.mDomainHandlers = mDomainHandlers;
    }
    
    private static Map<String, MethodDispatchHelper> buildDispatchTable(final ObjectMapper objectMapper, final Iterable<ChromeDevtoolsDomain> iterable) {
        Util.throwIfNull((Object)objectMapper);
        final HashMap hashMap = new HashMap();
        for (final ChromeDevtoolsDomain chromeDevtoolsDomain : (Iterable)Util.throwIfNull((Object)iterable)) {
            final Class<? extends ChromeDevtoolsDomain> class1 = chromeDevtoolsDomain.getClass();
            final String simpleName = class1.getSimpleName();
            for (final Method method : class1.getMethods()) {
                if (isDevtoolsMethod(method)) {
                    final MethodDispatchHelper methodDispatchHelper = new MethodDispatchHelper(objectMapper, chromeDevtoolsDomain, method);
                    final StringBuilder q = d.q(simpleName, ".");
                    q.append(method.getName());
                    hashMap.put(q.toString(), methodDispatchHelper);
                }
            }
        }
        return (Map<String, MethodDispatchHelper>)Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    private MethodDispatchHelper findMethodDispatcher(final String s) {
        synchronized (this) {
            if (this.mMethods == null) {
                this.mMethods = buildDispatchTable(this.mObjectMapper, this.mDomainHandlers);
            }
            return this.mMethods.get(s);
        }
    }
    
    private static boolean isDevtoolsMethod(final Method method) throws IllegalArgumentException {
        if (!method.isAnnotationPresent((Class<? extends Annotation>)ChromeDevtoolsMethod.class)) {
            return false;
        }
        final Class<?>[] parameterTypes = method.getParameterTypes();
        final StringBuilder sb = new StringBuilder();
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        final String string = sb.toString();
        Util.throwIfNot(parameterTypes.length == 2, "%s: expected 2 args, got %s", new Object[] { string, parameterTypes.length });
        Util.throwIfNot(parameterTypes[0].equals(JsonRpcPeer.class), "%s: expected 1st arg of JsonRpcPeer, got %s", new Object[] { string, parameterTypes[0].getName() });
        Util.throwIfNot(parameterTypes[1].equals(JSONObject.class), "%s: expected 2nd arg of JSONObject, got %s", new Object[] { string, parameterTypes[1].getName() });
        final Class<?> returnType = method.getReturnType();
        if (!returnType.equals(Void.TYPE)) {
            Util.throwIfNot(JsonRpcResult.class.isAssignableFrom(returnType), "%s: expected JsonRpcResult return type, got %s", new Object[] { string, returnType.getName() });
        }
        return true;
    }
    
    public JSONObject dispatch(final JsonRpcPeer jsonRpcPeer, final String s, final JSONObject jsonObject) throws JsonRpcException {
        final MethodDispatchHelper methodDispatcher = this.findMethodDispatcher(s);
        if (methodDispatcher != null) {
            try {
                return methodDispatcher.invoke(jsonRpcPeer, jsonObject);
            }
            catch (final JSONException ex) {
                throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, ex.toString(), null));
            }
            catch (final IllegalAccessException ex2) {
                throw new RuntimeException(ex2);
            }
            catch (final InvocationTargetException ex3) {
                final Throwable cause = ex3.getCause();
                ExceptionUtil.propagateIfInstanceOf(cause, (Class)JsonRpcException.class);
                throw ExceptionUtil.propagate(cause);
            }
        }
        throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.METHOD_NOT_FOUND, b.h("Not implemented: ", s), null));
    }
    
    public static class MethodDispatchHelper
    {
        private final ChromeDevtoolsDomain mInstance;
        private final Method mMethod;
        private final ObjectMapper mObjectMapper;
        
        public MethodDispatchHelper(final ObjectMapper mObjectMapper, final ChromeDevtoolsDomain mInstance, final Method mMethod) {
            this.mObjectMapper = mObjectMapper;
            this.mInstance = mInstance;
            this.mMethod = mMethod;
        }
        
        public JSONObject invoke(final JsonRpcPeer jsonRpcPeer, final JSONObject jsonObject) throws InvocationTargetException, IllegalAccessException, JSONException, JsonRpcException {
            final Object invoke = this.mMethod.invoke(this.mInstance, jsonRpcPeer, jsonObject);
            if (invoke != null && !(invoke instanceof EmptyResult)) {
                return (JSONObject)this.mObjectMapper.convertValue((Object)invoke, (Class)JSONObject.class);
            }
            return new JSONObject();
        }
    }
}
