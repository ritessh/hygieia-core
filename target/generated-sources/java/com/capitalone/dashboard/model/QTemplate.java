package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTemplate is a Querydsl query type for Template
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTemplate extends EntityPathBase<Template> {

    private static final long serialVersionUID = 311011932L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTemplate template1 = new QTemplate("template1");

    public final QBaseModel _super;

    //inherited
    public final StringPath clientReference;

    // inherited
    public final org.bson.types.QObjectId id;

    public final ListPath<String, StringPath> order = this.<String, StringPath>createList("order", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath template = createString("template");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final ListPath<String, StringPath> widgets = this.<String, StringPath>createList("widgets", String.class, StringPath.class, PathInits.DIRECT2);

    public QTemplate(String variable) {
        this(Template.class, forVariable(variable), INITS);
    }

    public QTemplate(Path<? extends Template> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTemplate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTemplate(PathMetadata metadata, PathInits inits) {
        this(Template.class, metadata, inits);
    }

    public QTemplate(Class<? extends Template> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}

