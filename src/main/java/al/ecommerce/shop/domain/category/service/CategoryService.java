package al.ecommerce.shop.domain.category.service;

import al.ecommerce.shop.domain.category.model.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;
public interface CategoryService {
    List<Category> getCategories();

    ResponseEntity<?> createCategory(Category category);

    ResponseEntity<?> deleteCategory(String id);

    ResponseEntity<?> updateCategory(Category category, String id);

}
