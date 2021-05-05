package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBaseModel is a Querydsl query type for BaseModel
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QBaseModel extends BeanPath<BaseModel> {

    private static final long serialVersionUID = 1531477302L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBaseModel baseModel = new QBaseModel("baseModel");

    public final StringPath clientReference = createString("clientReference");

    public final org.bson.types.QObjectId id;

    public final DateTimePath<java.util.Date> upsertTime = createDateTime("upsertTime", java.util.Date.class);

    public QBaseModel(String variable) {
        this(BaseModel.class, forVariable(variable), INITS);
    }

    public QBaseModel(Path<? extends BaseModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBaseModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBaseModel(PathMetadata metadata, PathInits inits) {
        this(BaseModel.class, metadata, inits);
    }

    public QBaseModel(Class<? extends BaseModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new org.bson.types.QObjectId(forProperty("id")) : null;
    }

}

