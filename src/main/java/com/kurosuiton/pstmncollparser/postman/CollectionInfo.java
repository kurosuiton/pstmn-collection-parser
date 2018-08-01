package com.kurosuiton.pstmncollparser.postman;

import lombok.Getter;

/**
 * Информация о коллекции
 *
 * @author Artem_Velichkin
 */
class CollectionInfo {

    /**
     * ID коллекции
     */
    @Getter
    private String _postman_id;

    /**
     * Название коллекции
     */
    @Getter
    private String name;

    /**
     * Схема данных
     */
    @Getter
    private String schema;

}
