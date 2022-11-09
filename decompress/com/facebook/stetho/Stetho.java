// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho;

import java.util.HashSet;
import java.util.Set;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.server.ServerManager;
import com.facebook.stetho.server.SocketHandler;
import com.facebook.stetho.server.LocalSocketServer;
import com.facebook.stetho.server.SocketHandlerFactory;
import com.facebook.stetho.server.LazySocketHandler;
import com.facebook.stetho.server.AddressNameHelper;
import java.util.ArrayList;
import com.facebook.stetho.inspector.database.DatabaseDriver2Adapter;
import java.util.Iterator;
import com.facebook.stetho.inspector.database.DatabaseConnectionProvider;
import com.facebook.stetho.inspector.database.DefaultDatabaseConnectionProvider;
import com.facebook.stetho.inspector.database.DefaultDatabaseFilesProvider;
import com.facebook.stetho.inspector.database.SqliteDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.Worker;
import com.facebook.stetho.inspector.protocol.module.Runtime;
import com.facebook.stetho.inspector.runtime.RhinoDetectingRuntimeReplFactory;
import com.facebook.stetho.inspector.protocol.module.Profiler;
import com.facebook.stetho.inspector.protocol.module.Page;
import com.facebook.stetho.inspector.protocol.module.Network;
import com.facebook.stetho.inspector.protocol.module.Inspector;
import com.facebook.stetho.inspector.protocol.module.HeapProfiler;
import com.facebook.stetho.inspector.protocol.module.DOMStorage;
import com.facebook.stetho.inspector.protocol.module.CSS;
import com.facebook.stetho.inspector.protocol.module.DOM;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.protocol.module.Debugger;
import com.facebook.stetho.inspector.protocol.module.Console;
import com.facebook.stetho.inspector.elements.android.AndroidDocumentProviderFactory;
import java.util.Collections;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.database.DatabaseFilesProvider;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.util.List;
import com.facebook.stetho.dumpapp.plugins.FilesDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.HprofDumperPlugin;
import com.facebook.stetho.dumpapp.DumperPlugin;
import com.facebook.stetho.common.LogUtil;
import android.app.Application;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;
import android.content.Context;

public class Stetho
{
    private Stetho() {
    }
    
    public static DumperPluginsProvider defaultDumperPluginsProvider(final Context context) {
        return (DumperPluginsProvider)new Stetho$2(context);
    }
    
    public static InspectorModulesProvider defaultInspectorModulesProvider(final Context context) {
        return (InspectorModulesProvider)new Stetho$3(context);
    }
    
    public static void initialize(final Initializer initializer) {
        if (!ActivityTracker.get().beginTrackingIfPossible((Application)Initializer.access$100(initializer).getApplicationContext())) {
            LogUtil.w("Automatic activity tracking not available on this API level, caller must invoke ActivityTracker methods manually!");
        }
        initializer.start();
    }
    
    public static void initializeWithDefaults(final Context context) {
        initialize((Initializer)new Stetho$1(context, context));
    }
    
    public static InitializerBuilder newInitializerBuilder(final Context context) {
        return new InitializerBuilder(context, null);
    }
    
    public static final class DefaultDumperPluginsBuilder
    {
        private final Context mContext;
        private final PluginBuilder<DumperPlugin> mDelegate;
        
        public DefaultDumperPluginsBuilder(final Context mContext) {
            this.mDelegate = (PluginBuilder<DumperPlugin>)new PluginBuilder(null);
            this.mContext = mContext;
        }
        
        private DefaultDumperPluginsBuilder provideIfDesired(final DumperPlugin dumperPlugin) {
            this.mDelegate.provideIfDesired(dumperPlugin.getName(), dumperPlugin);
            return this;
        }
        
        public Iterable<DumperPlugin> finish() {
            this.provideIfDesired(new HprofDumperPlugin(this.mContext));
            this.provideIfDesired(new SharedPreferencesDumperPlugin(this.mContext));
            this.provideIfDesired((DumperPlugin)new CrashDumperPlugin());
            this.provideIfDesired(new FilesDumperPlugin(this.mContext));
            return this.mDelegate.finish();
        }
        
        public DefaultDumperPluginsBuilder provide(final DumperPlugin dumperPlugin) {
            this.mDelegate.provide(dumperPlugin.getName(), dumperPlugin);
            return this;
        }
        
        public DefaultDumperPluginsBuilder remove(final String s) {
            this.mDelegate.remove(s);
            return this;
        }
    }
    
    public static final class DefaultInspectorModulesBuilder
    {
        private final Application mContext;
        private List<DatabaseDriver2> mDatabaseDrivers;
        private DatabaseFilesProvider mDatabaseFilesProvider;
        private final PluginBuilder<ChromeDevtoolsDomain> mDelegate;
        private DocumentProviderFactory mDocumentProvider;
        private boolean mExcludeSqliteDatabaseDriver;
        private RuntimeReplFactory mRuntimeRepl;
        
        public DefaultInspectorModulesBuilder(final Context context) {
            this.mDelegate = (PluginBuilder<ChromeDevtoolsDomain>)new PluginBuilder(null);
            this.mContext = (Application)context.getApplicationContext();
        }
        
        private DefaultInspectorModulesBuilder provideIfDesired(final ChromeDevtoolsDomain chromeDevtoolsDomain) {
            this.mDelegate.provideIfDesired(chromeDevtoolsDomain.getClass().getName(), chromeDevtoolsDomain);
            return this;
        }
        
        private DocumentProviderFactory resolveDocumentProvider() {
            final DocumentProviderFactory mDocumentProvider = this.mDocumentProvider;
            if (mDocumentProvider != null) {
                return mDocumentProvider;
            }
            return (DocumentProviderFactory)new AndroidDocumentProviderFactory(this.mContext, (List)Collections.emptyList());
        }
        
        @Deprecated
        public DefaultInspectorModulesBuilder databaseFiles(final DatabaseFilesProvider mDatabaseFilesProvider) {
            this.mDatabaseFilesProvider = mDatabaseFilesProvider;
            return this;
        }
        
        public DefaultInspectorModulesBuilder documentProvider(final DocumentProviderFactory mDocumentProvider) {
            this.mDocumentProvider = mDocumentProvider;
            return this;
        }
        
        public DefaultInspectorModulesBuilder excludeSqliteDatabaseDriver(final boolean mExcludeSqliteDatabaseDriver) {
            this.mExcludeSqliteDatabaseDriver = mExcludeSqliteDatabaseDriver;
            return this;
        }
        
        public Iterable<ChromeDevtoolsDomain> finish() {
            this.provideIfDesired(new Console());
            this.provideIfDesired((ChromeDevtoolsDomain)new Debugger());
            final DocumentProviderFactory resolveDocumentProvider = this.resolveDocumentProvider();
            if (resolveDocumentProvider != null) {
                final Document document = new Document(resolveDocumentProvider);
                this.provideIfDesired(new DOM(document));
                this.provideIfDesired(new CSS(document));
            }
            this.provideIfDesired(new DOMStorage((Context)this.mContext));
            this.provideIfDesired((ChromeDevtoolsDomain)new HeapProfiler());
            this.provideIfDesired((ChromeDevtoolsDomain)new Inspector());
            this.provideIfDesired((ChromeDevtoolsDomain)new Network((Context)this.mContext));
            this.provideIfDesired((ChromeDevtoolsDomain)new Page((Context)this.mContext));
            this.provideIfDesired((ChromeDevtoolsDomain)new Profiler());
            Object mRuntimeRepl = this.mRuntimeRepl;
            if (mRuntimeRepl == null) {
                mRuntimeRepl = new RhinoDetectingRuntimeReplFactory((Context)this.mContext);
            }
            this.provideIfDesired((ChromeDevtoolsDomain)new Runtime((RuntimeReplFactory)mRuntimeRepl));
            this.provideIfDesired((ChromeDevtoolsDomain)new Worker());
            final Database database = new Database();
            int n = 0;
            int n2 = 0;
            final List<DatabaseDriver2> mDatabaseDrivers = this.mDatabaseDrivers;
            if (mDatabaseDrivers != null) {
                final Iterator<DatabaseDriver2> iterator = mDatabaseDrivers.iterator();
                while (true) {
                    n = n2;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final DatabaseDriver2 databaseDriver2 = iterator.next();
                    database.add(databaseDriver2);
                    if (!(databaseDriver2 instanceof SqliteDatabaseDriver)) {
                        continue;
                    }
                    n2 = 1;
                }
            }
            if (n == 0 && !this.mExcludeSqliteDatabaseDriver) {
                final Application mContext = this.mContext;
                DatabaseFilesProvider mDatabaseFilesProvider = this.mDatabaseFilesProvider;
                if (mDatabaseFilesProvider == null) {
                    mDatabaseFilesProvider = new DefaultDatabaseFilesProvider((Context)mContext);
                }
                database.add((DatabaseDriver2)new SqliteDatabaseDriver((Context)mContext, mDatabaseFilesProvider, (DatabaseConnectionProvider)new DefaultDatabaseConnectionProvider()));
            }
            this.provideIfDesired((ChromeDevtoolsDomain)database);
            return this.mDelegate.finish();
        }
        
        @Deprecated
        public DefaultInspectorModulesBuilder provide(final ChromeDevtoolsDomain chromeDevtoolsDomain) {
            this.mDelegate.provide(chromeDevtoolsDomain.getClass().getName(), chromeDevtoolsDomain);
            return this;
        }
        
        @Deprecated
        public DefaultInspectorModulesBuilder provideDatabaseDriver(final Database.DatabaseDriver databaseDriver) {
            this.provideDatabaseDriver(new DatabaseDriver2Adapter(databaseDriver));
            return this;
        }
        
        public DefaultInspectorModulesBuilder provideDatabaseDriver(final DatabaseDriver2 databaseDriver2) {
            if (this.mDatabaseDrivers == null) {
                this.mDatabaseDrivers = new ArrayList<DatabaseDriver2>();
            }
            this.mDatabaseDrivers.add(databaseDriver2);
            return this;
        }
        
        @Deprecated
        public DefaultInspectorModulesBuilder remove(final String s) {
            this.mDelegate.remove(s);
            return this;
        }
        
        public DefaultInspectorModulesBuilder runtimeRepl(final RuntimeReplFactory mRuntimeRepl) {
            this.mRuntimeRepl = mRuntimeRepl;
            return this;
        }
    }
    
    public abstract static class Initializer
    {
        private final Context mContext;
        
        public Initializer(final Context context) {
            this.mContext = context.getApplicationContext();
        }
        
        public static /* synthetic */ Context access$100(final Initializer initializer) {
            return initializer.mContext;
        }
        
        public abstract Iterable<DumperPlugin> getDumperPlugins();
        
        public abstract Iterable<ChromeDevtoolsDomain> getInspectorModules();
        
        public final void start() {
            new ServerManager(new LocalSocketServer("main", AddressNameHelper.createCustomAddress("_devtools_remote"), (SocketHandler)new LazySocketHandler((SocketHandlerFactory)new Initializer.Stetho$Initializer$RealSocketHandlerFactory(this, (Stetho$1)null)))).start();
        }
    }
    
    public static class InitializerBuilder
    {
        public final Context mContext;
        public DumperPluginsProvider mDumperPlugins;
        public InspectorModulesProvider mInspectorModules;
        
        private InitializerBuilder(final Context context) {
            this.mContext = context.getApplicationContext();
        }
        
        public Initializer build() {
            return (Initializer)new Stetho$BuilderBasedInitializer(this, (Stetho$1)null);
        }
        
        public InitializerBuilder enableDumpapp(final DumperPluginsProvider dumperPluginsProvider) {
            this.mDumperPlugins = Util.throwIfNull(dumperPluginsProvider);
            return this;
        }
        
        public InitializerBuilder enableWebKitInspector(final InspectorModulesProvider mInspectorModules) {
            this.mInspectorModules = mInspectorModules;
            return this;
        }
    }
    
    public static class PluginBuilder<T>
    {
        private boolean mFinished;
        private final ArrayList<T> mPlugins;
        private final Set<String> mProvidedNames;
        private final Set<String> mRemovedNames;
        
        private PluginBuilder() {
            this.mProvidedNames = new HashSet<String>();
            this.mRemovedNames = new HashSet<String>();
            this.mPlugins = new ArrayList<T>();
        }
        
        private void throwIfFinished() {
            if (!this.mFinished) {
                return;
            }
            throw new IllegalStateException("Must not continue to build after finish()");
        }
        
        public Iterable<T> finish() {
            this.mFinished = true;
            return this.mPlugins;
        }
        
        public void provide(final String s, final T t) {
            this.throwIfFinished();
            this.mPlugins.add(t);
            this.mProvidedNames.add(s);
        }
        
        public void provideIfDesired(final String s, final T t) {
            this.throwIfFinished();
            if (!this.mRemovedNames.contains(s) && this.mProvidedNames.add(s)) {
                this.mPlugins.add(t);
            }
        }
        
        public void remove(final String s) {
            this.throwIfFinished();
            this.mRemovedNames.add(s);
        }
    }
}
