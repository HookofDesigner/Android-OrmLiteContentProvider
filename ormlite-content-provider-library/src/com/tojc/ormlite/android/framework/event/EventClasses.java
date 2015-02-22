/*
 * This file is part of the Android-OrmLiteContentProvider package.
 *
 * Copyright (c) 2012, Android-OrmLiteContentProvider Team.
 *                     Jaken Jarvis (jaken.jarvis@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The author may be contacted via
 * https://github.com/jakenjarvis/Android-OrmLiteContentProvider
 */
package com.tojc.ormlite.android.framework.event;

import com.tojc.ormlite.android.framework.event.dispatcher.OnAfterApplyBatchEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnAfterBulkInsertEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnBeforeApplyBatchEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnBeforeBulkInsertEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnBulkInsertCompletedEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnBulkInsertEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnDeleteCompletedEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnDeleteEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnInsertCompletedEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnInsertEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnQueryCompletedEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnQueryEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnUpdateCompletedEventDispatcher;
import com.tojc.ormlite.android.framework.event.dispatcher.OnUpdateEventDispatcher;
import com.tojc.ormlite.android.framework.event.exchanger.OnAfterApplyBatchEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnAfterBulkInsertEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnBeforeApplyBatchEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnBeforeBulkInsertEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnBulkInsertCompletedEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnBulkInsertEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnDeleteCompletedEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnDeleteEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnInsertCompletedEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnInsertEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnQueryCompletedEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnQueryEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnUpdateCompletedEventExchanger;
import com.tojc.ormlite.android.framework.event.exchanger.OnUpdateEventExchanger;
import com.tojc.ormlite.android.event.listener.OnAfterApplyBatchListener;
import com.tojc.ormlite.android.event.listener.OnAfterBulkInsertListener;
import com.tojc.ormlite.android.event.listener.OnBeforeApplyBatchListener;
import com.tojc.ormlite.android.event.listener.OnBeforeBulkInsertListener;
import com.tojc.ormlite.android.event.listener.OnBulkInsertCompletedListener;
import com.tojc.ormlite.android.event.listener.OnBulkInsertListener;
import com.tojc.ormlite.android.event.listener.OnDeleteCompletedListener;
import com.tojc.ormlite.android.event.listener.OnDeleteListener;
import com.tojc.ormlite.android.event.listener.OnInsertCompletedListener;
import com.tojc.ormlite.android.event.listener.OnInsertListener;
import com.tojc.ormlite.android.event.listener.OnQueryCompletedListener;
import com.tojc.ormlite.android.event.listener.OnQueryListener;
import com.tojc.ormlite.android.event.listener.OnUpdateCompletedListener;
import com.tojc.ormlite.android.event.listener.OnUpdateListener;
import com.tojc.ormlite.android.framework.event.expandevent.ContentProviderEventListenerInterfaceBase;
import com.tojc.ormlite.android.framework.event.multievent.MultiEventListenerInterfaceBase;
import com.tojc.ormlite.android.framework.event.multievent.MultiEventObjectBase;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnAfterApplyBatchMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnAfterBulkInsertMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnBeforeApplyBatchMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnBeforeBulkInsertMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnBulkInsertCompletedMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnBulkInsertMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnDeleteCompletedMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnDeleteMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnInsertCompletedMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnInsertMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnQueryCompletedMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnQueryMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnUpdateCompletedMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.listener.OnUpdateMultiEventListener;
import com.tojc.ormlite.android.framework.event.multievent.object.OnAfterApplyBatchMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnAfterBulkInsertMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnBeforeApplyBatchMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnBeforeBulkInsertMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnBulkInsertCompletedMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnBulkInsertMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnDeleteCompletedMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnDeleteMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnInsertCompletedMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnInsertMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnQueryCompletedMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnQueryMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnUpdateCompletedMultiEventObject;
import com.tojc.ormlite.android.framework.event.multievent.object.OnUpdateMultiEventObject;

import java.lang.reflect.Modifier;

/**
 * Created by Jaken on 2014/05/08.
 */
public enum EventClasses {
    OnQuery(0x0001, OnQueryEventDispatcher.class, OnQueryMultiEventListener.class, OnQueryMultiEventObject.class, OnQueryListener.class, OnQueryEventExchanger.class),
    OnQueryCompleted(0x0002, OnQueryCompletedEventDispatcher.class, OnQueryCompletedMultiEventListener.class, OnQueryCompletedMultiEventObject.class, OnQueryCompletedListener.class, OnQueryCompletedEventExchanger.class),
    OnInsert(0x0004, OnInsertEventDispatcher.class, OnInsertMultiEventListener.class, OnInsertMultiEventObject.class, OnInsertListener.class, OnInsertEventExchanger.class),
    OnInsertCompleted(0x0008, OnInsertCompletedEventDispatcher.class, OnInsertCompletedMultiEventListener.class, OnInsertCompletedMultiEventObject.class, OnInsertCompletedListener.class, OnInsertCompletedEventExchanger.class),
    OnDelete(0x0010, OnDeleteEventDispatcher.class, OnDeleteMultiEventListener.class, OnDeleteMultiEventObject.class, OnDeleteListener.class, OnDeleteEventExchanger.class),
    OnDeleteCompleted(0x0020, OnDeleteCompletedEventDispatcher.class, OnDeleteCompletedMultiEventListener.class, OnDeleteCompletedMultiEventObject.class, OnDeleteCompletedListener.class, OnDeleteCompletedEventExchanger.class),
    OnUpdate(0x0040, OnUpdateEventDispatcher.class, OnUpdateMultiEventListener.class, OnUpdateMultiEventObject.class, OnUpdateListener.class, OnUpdateEventExchanger.class),
    OnUpdateCompleted(0x0080, OnUpdateCompletedEventDispatcher.class, OnUpdateCompletedMultiEventListener.class, OnUpdateCompletedMultiEventObject.class, OnUpdateCompletedListener.class, OnUpdateCompletedEventExchanger.class),
    OnBeforeBulkInsert(0x0100, OnBeforeBulkInsertEventDispatcher.class, OnBeforeBulkInsertMultiEventListener.class, OnBeforeBulkInsertMultiEventObject.class, OnBeforeBulkInsertListener.class, OnBeforeBulkInsertEventExchanger.class),
    OnBulkInsert(0x0200, OnBulkInsertEventDispatcher.class, OnBulkInsertMultiEventListener.class, OnBulkInsertMultiEventObject.class, OnBulkInsertListener.class, OnBulkInsertEventExchanger.class),
    OnAfterBulkInsert(0x0400, OnAfterBulkInsertEventDispatcher.class, OnAfterBulkInsertMultiEventListener.class, OnAfterBulkInsertMultiEventObject.class, OnAfterBulkInsertListener.class, OnAfterBulkInsertEventExchanger.class),
    OnBulkInsertCompleted(0x0800, OnBulkInsertCompletedEventDispatcher.class, OnBulkInsertCompletedMultiEventListener.class, OnBulkInsertCompletedMultiEventObject.class, OnBulkInsertCompletedListener.class, OnBulkInsertCompletedEventExchanger.class),
    OnBeforeApplyBatch(0x1000, OnBeforeApplyBatchEventDispatcher.class, OnBeforeApplyBatchMultiEventListener.class, OnBeforeApplyBatchMultiEventObject.class, OnBeforeApplyBatchListener.class, OnBeforeApplyBatchEventExchanger.class),
    OnAfterApplyBatch(0x2000, OnAfterApplyBatchEventDispatcher.class, OnAfterApplyBatchMultiEventListener.class, OnAfterApplyBatchMultiEventObject.class, OnAfterApplyBatchListener.class, OnAfterApplyBatchEventExchanger.class);

    private final long internalId;

    private final Class<?> clazzEventDispatcher;

    private final Class<?> clazzMultiEventListener;
    private final Class<?> clazzMultiEventObject;

    private final Class<?> clazzContentProviderListener;
    private final Class<?> clazzEventExchanger;

    private EventClasses(long internalId, Class<?> clazzEventDispatcher, Class<?> clazzMultiEventListener, Class<?> clazzMultiEventObject, Class<?> clazzContentProviderListener, Class<?> clazzEventExchanger) {
        this.internalId = internalId;
        this.clazzEventDispatcher = clazzEventDispatcher;
        this.clazzMultiEventListener = clazzMultiEventListener;
        this.clazzMultiEventObject = clazzMultiEventObject;
        this.clazzContentProviderListener = clazzContentProviderListener;
        this.clazzEventExchanger = clazzEventExchanger;
    }

    /**
     * This method is for testing. I will change this value on a whim. Please do not use.
     * @return
     */
    public long getInternalId() {
        return this.internalId;
    }

    public static EventClasses toEventClasses(String name) {
        EventClasses result = null;
        for (EventClasses value : values()) {
            if (value.name().equals(name)) {
                result = value;
                break;
            }
        }
        return result;
    }

    public static EventClasses toEventClasses(Class<?> clazz) {
        EventClasses result = null;
        for (EventClasses value : values()) {
            if (value.contains(clazz)) {
                result = value;
                break;
            }
        }
        return result;
    }

    public boolean contains(Class<?> clazz) {
        boolean result = false;
        if ((this.clazzEventDispatcher == clazz)
                || (this.clazzMultiEventListener == clazz)
                || (this.clazzMultiEventObject == clazz)
                || (this.clazzContentProviderListener == clazz)
                || (this.clazzEventExchanger == clazz)) {
            result = true;
        }
        return result;
    }

    public boolean isImplementedMultiEventListener(Object object) {
        boolean result = false;
        if (object != null) {
            if (!object.getClass().isInterface()
                    && this.getMultiEventListenerClass().isAssignableFrom(object.getClass())
                    && !Modifier.isAbstract(object.getClass().getModifiers())) {
                result = true;
            }
        }
        return result;
    }

    public boolean isImplementedContentProviderListener(Object object) {
        boolean result = false;
        if (object != null) {
            if (!object.getClass().isInterface()
                    && this.getContentProviderListenerClass().isAssignableFrom(object.getClass())
                    && !Modifier.isAbstract(object.getClass().getModifiers())) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return this.name();
    }

    @SuppressWarnings("unchecked")
    public Class<EventDispatcherBase<?, ?>> getEventDispatcherClass() {
        return (Class<EventDispatcherBase<?, ?>>) this.clazzEventDispatcher;
    }

    @SuppressWarnings("unchecked")
    public Class<MultiEventListenerInterfaceBase> getMultiEventListenerClass() {
        return (Class<MultiEventListenerInterfaceBase>) this.clazzMultiEventListener;
    }

    @SuppressWarnings("unchecked")
    public Class<MultiEventObjectBase> getMultiEventObjectClass() {
        return (Class<MultiEventObjectBase>) this.clazzMultiEventObject;
    }

    @SuppressWarnings("unchecked")
    public Class<ContentProviderEventListenerInterfaceBase> getContentProviderListenerClass() {
        return (Class<ContentProviderEventListenerInterfaceBase>) this.clazzContentProviderListener;
    }

    @SuppressWarnings("unchecked")
    public Class<EventExchangerBase> getEventExchangerClass() {
        return (Class<EventExchangerBase>) this.clazzEventExchanger;
    }
}