package com.br.joao.projetos.projeto_farmacia_api.service;


import com.br.joao.projetos.projeto_farmacia_api.entity.Item;
import com.br.joao.projetos.projeto_farmacia_api.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;


    public List<Item> findAll() {
        return itemRepository.findAll();
    }

   public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
   }

   public Item createItem(Item item) {
        return itemRepository.save(item);
   }

   public Item updateItem(Long id, Item itemDetails) {
       Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
       item.setName(itemDetails.getName());
       item.setDescription(itemDetails.getDescription());
       item.setPrice(itemDetails.getPrice());
       return itemRepository.save(item);
   }

   public void deleteItem(Long id) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        itemRepository.delete(item);
   }
}
