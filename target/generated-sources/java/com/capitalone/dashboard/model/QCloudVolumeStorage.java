package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCloudVolumeStorage is a Querydsl query type for CloudVolumeStorage
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCloudVolumeStorage extends EntityPathBase<CloudVolumeStorage> {

    private static final long serialVersionUID = -1707352786L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCloudVolumeStorage cloudVolumeStorage = new QCloudVolumeStorage("cloudVolumeStorage");

    public final QBaseModel _super;

    public final StringPath accountNumber = createString("accountNumber");

    public final ListPath<String, StringPath> attachInstances = this.<String, StringPath>createList("attachInstances", String.class, StringPath.class, PathInits.DIRECT2);

    //inherited
    public final StringPath clientReference;

    public final NumberPath<Long> creationDate = createNumber("creationDate", Long.class);

    public final BooleanPath encrypted = createBoolean("encrypted");

    // inherited
    public final org.bson.types.QObjectId id;

    public final NumberPath<Integer> size = createNumber("size", Integer.class);

    public final StringPath status = createString("status");

    public final ListPath<NameValue, QNameValue> tags = this.<NameValue, QNameValue>createList("tags", NameValue.class, QNameValue.class, PathInits.DIRECT2);

    public final StringPath type = createString("type");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath volumeId = createString("volumeId");

    public final StringPath zone = createString("zone");

    public QCloudVolumeStorage(String variable) {
        this(CloudVolumeStorage.class, forVariable(variable), INITS);
    }

    public QCloudVolumeStorage(Path<? extends CloudVolumeStorage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCloudVolumeStorage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCloudVolumeStorage(PathMetadata metadata, PathInits inits) {
        this(CloudVolumeStorage.class, metadata, inits);
    }

    public QCloudVolumeStorage(Class<? extends CloudVolumeStorage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

