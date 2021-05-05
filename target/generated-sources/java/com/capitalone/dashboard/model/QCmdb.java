package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCmdb is a Querydsl query type for Cmdb
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCmdb extends EntityPathBase<Cmdb> {

    private static final long serialVersionUID = 1154205002L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCmdb cmdb = new QCmdb("cmdb");

    public final QBaseModel _super;

    public final StringPath appServiceOwner = createString("appServiceOwner");

    public final StringPath appServiceOwnerUserName = createString("appServiceOwnerUserName");

    public final StringPath assignmentGroup = createString("assignmentGroup");

    public final StringPath businessOwner = createString("businessOwner");

    public final StringPath businessOwnerUserName = createString("businessOwnerUserName");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath commonName = createString("commonName");

    public final ListPath<String, StringPath> components = this.<String, StringPath>createList("components", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath configurationItem = createString("configurationItem");

    public final StringPath configurationItemSubType = createString("configurationItemSubType");

    public final StringPath configurationItemType = createString("configurationItemType");

    public final StringPath configurationKey = createString("configurationKey");

    public final StringPath developmentOwner = createString("developmentOwner");

    public final StringPath developmentOwnerUserName = createString("developmentOwnerUserName");

    public final ListPath<String, StringPath> environments = this.<String, StringPath>createList("environments", String.class, StringPath.class, PathInits.DIRECT2);

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath itemType = createString("itemType");

    public final StringPath legacyServiceManagerName = createString("legacyServiceManagerName");

    public final StringPath ownerDept = createString("ownerDept");

    public final StringPath ownerSubDept = createString("ownerSubDept");

    public final StringPath supportOwner = createString("supportOwner");

    public final StringPath supportOwnerUserName = createString("supportOwnerUserName");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final BooleanPath validConfigItem = createBoolean("validConfigItem");

    public QCmdb(String variable) {
        this(Cmdb.class, forVariable(variable), INITS);
    }

    public QCmdb(Path<? extends Cmdb> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCmdb(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCmdb(PathMetadata metadata, PathInits inits) {
        this(Cmdb.class, metadata, inits);
    }

    public QCmdb(Class<? extends Cmdb> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

