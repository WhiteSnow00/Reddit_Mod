// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.twitter.sdk.android.core.internal.persistence.SerializationStrategy;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStoreStrategy;
import java.util.concurrent.atomic.AtomicReference;

public class PersistedSessionManager<T extends Session> implements SessionManager<T>
{
    private static final int NUM_SESSIONS = 1;
    private final AtomicReference<T> activeSessionRef;
    private final PreferenceStoreStrategy<T> activeSessionStorage;
    private final String prefKeySession;
    private final PreferenceStore preferenceStore;
    private volatile boolean restorePending;
    private final SerializationStrategy<T> serializer;
    private final ConcurrentHashMap<Long, T> sessionMap;
    private final ConcurrentHashMap<Long, PreferenceStoreStrategy<T>> storageMap;
    
    public PersistedSessionManager(final PreferenceStore preferenceStore, final SerializationStrategy<T> serializationStrategy, final String s, final String s2) {
        this(preferenceStore, serializationStrategy, (ConcurrentHashMap)new ConcurrentHashMap(1), (ConcurrentHashMap)new ConcurrentHashMap(1), (PreferenceStoreStrategy)new PreferenceStoreStrategy(preferenceStore, serializationStrategy, s), s2);
    }
    
    public PersistedSessionManager(final PreferenceStore preferenceStore, final SerializationStrategy<T> serializer, final ConcurrentHashMap<Long, T> sessionMap, final ConcurrentHashMap<Long, PreferenceStoreStrategy<T>> storageMap, final PreferenceStoreStrategy<T> activeSessionStorage, final String prefKeySession) {
        this.restorePending = true;
        this.preferenceStore = preferenceStore;
        this.serializer = serializer;
        this.sessionMap = sessionMap;
        this.storageMap = storageMap;
        this.activeSessionStorage = activeSessionStorage;
        this.activeSessionRef = new AtomicReference<T>();
        this.prefKeySession = prefKeySession;
    }
    
    private void internalSetSession(final long n, final T t, final boolean b) {
        this.sessionMap.put(n, t);
        PreferenceStoreStrategy preferenceStoreStrategy;
        if ((preferenceStoreStrategy = this.storageMap.get(n)) == null) {
            preferenceStoreStrategy = new PreferenceStoreStrategy(this.preferenceStore, this.serializer, this.getPrefKey(n));
            this.storageMap.putIfAbsent(n, preferenceStoreStrategy);
        }
        preferenceStoreStrategy.save(t);
        final Session session = this.activeSessionRef.get();
        if (session != null && session.getId() != n && !b) {
            return;
        }
        synchronized (this) {
            final AtomicReference<T> activeSessionRef = this.activeSessionRef;
            while (true) {
                while (!activeSessionRef.compareAndSet((T)session, t)) {
                    if (activeSessionRef.get() != session) {
                        this.activeSessionStorage.save(t);
                        return;
                    }
                }
                continue;
            }
        }
    }
    
    private void restoreActiveSession() {
        final Session session = this.activeSessionStorage.restore();
        if (session != null) {
            this.internalSetSession(session.getId(), (T)session, false);
        }
    }
    
    private void restoreAllSessions() {
        synchronized (this) {
            if (this.restorePending) {
                this.restoreActiveSession();
                this.restoreSessions();
                this.restorePending = false;
            }
        }
    }
    
    private void restoreSessions() {
        for (final Map.Entry<String, V> entry : this.preferenceStore.get().getAll().entrySet()) {
            if (this.isSessionPreferenceKey(entry.getKey())) {
                final Session session = (Session)this.serializer.deserialize((String)entry.getValue());
                if (session == null) {
                    continue;
                }
                this.internalSetSession(session.getId(), (T)session, false);
            }
        }
    }
    
    public void clearActiveSession() {
        this.restoreAllSessionsIfNecessary();
        if (this.activeSessionRef.get() != null) {
            this.clearSession(this.activeSessionRef.get().getId());
        }
    }
    
    public void clearSession(final long n) {
        this.restoreAllSessionsIfNecessary();
        if (this.activeSessionRef.get() != null && this.activeSessionRef.get().getId() == n) {
            synchronized (this) {
                this.activeSessionRef.set(null);
                this.activeSessionStorage.clear();
            }
        }
        this.sessionMap.remove(n);
        final PreferenceStoreStrategy preferenceStoreStrategy = this.storageMap.remove(n);
        if (preferenceStoreStrategy != null) {
            preferenceStoreStrategy.clear();
        }
    }
    
    public T getActiveSession() {
        this.restoreAllSessionsIfNecessary();
        return this.activeSessionRef.get();
    }
    
    public String getPrefKey(final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.prefKeySession);
        sb.append("_");
        sb.append(n);
        return sb.toString();
    }
    
    public T getSession(final long n) {
        this.restoreAllSessionsIfNecessary();
        return this.sessionMap.get(n);
    }
    
    public Map<Long, T> getSessionMap() {
        this.restoreAllSessionsIfNecessary();
        return Collections.unmodifiableMap((Map<? extends Long, ? extends T>)this.sessionMap);
    }
    
    public boolean isSessionPreferenceKey(final String s) {
        return s.startsWith(this.prefKeySession);
    }
    
    public void restoreAllSessionsIfNecessary() {
        if (this.restorePending) {
            this.restoreAllSessions();
        }
    }
    
    public void setActiveSession(final T t) {
        if (t != null) {
            this.restoreAllSessionsIfNecessary();
            this.internalSetSession(t.getId(), t, true);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }
    
    public void setSession(final long n, final T t) {
        if (t != null) {
            this.restoreAllSessionsIfNecessary();
            this.internalSetSession(n, t, false);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }
}
