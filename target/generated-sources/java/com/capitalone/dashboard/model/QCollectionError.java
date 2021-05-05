package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCollectionError is a Querydsl query type for CollectionError
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCollectionError extends BeanPath<CollectionError> {

    private static final long serialVersionUID = -2126592536L;

    public static final QCollectionError collectionError = new QCollectionError("collectionError");

    public final StringPath errorCode = createString("errorCode");

    public final StringPath errorMessage = createString("errorMessage");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public QCollectionError(String variable) {
        super(CollectionError.class, forVariable(variable));
    }

    public QCollectionError(Path<? extends CollectionError> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCollectionError(PathMetadata metadata) {
        super(CollectionError.class, metadata);
    }

}

