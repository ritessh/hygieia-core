package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAutoDiscoveryMetaData is a Querydsl query type for AutoDiscoveryMetaData
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QAutoDiscoveryMetaData extends BeanPath<AutoDiscoveryMetaData> {

    private static final long serialVersionUID = -1125580658L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAutoDiscoveryMetaData autoDiscoveryMetaData = new QAutoDiscoveryMetaData("autoDiscoveryMetaData");

    public final StringPath applicationName = createString("applicationName");

    public final StringPath businessApplication = createString("businessApplication");

    public final StringPath businessService = createString("businessService");

    public final StringPath componentName = createString("componentName");

    public final QOwner owner;

    public final ListPath<Owner, QOwner> owners = this.<Owner, QOwner>createList("owners", Owner.class, QOwner.class, PathInits.DIRECT2);

    public final StringPath template = createString("template");

    public final StringPath title = createString("title");

    public final StringPath type = createString("type");

    public QAutoDiscoveryMetaData(String variable) {
        this(AutoDiscoveryMetaData.class, forVariable(variable), INITS);
    }

    public QAutoDiscoveryMetaData(Path<? extends AutoDiscoveryMetaData> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAutoDiscoveryMetaData(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAutoDiscoveryMetaData(PathMetadata metadata, PathInits inits) {
        this(AutoDiscoveryMetaData.class, metadata, inits);
    }

    public QAutoDiscoveryMetaData(Class<? extends AutoDiscoveryMetaData> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.owner = inits.isInitialized("owner") ? new QOwner(forProperty("owner")) : null;
    }

}

