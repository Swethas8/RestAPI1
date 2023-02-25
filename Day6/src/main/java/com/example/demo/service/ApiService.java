package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.models.Child;
import com.example.demo.repositories.ChildRepo;

@Service
public class ApiService
{
@Autowired
ChildRepo repository;
public boolean addChild(Child child)
{
repository.save(child);
return true;
}

public List<Child>getChild()
{
return repository.findAll();
}
//sorting
public List<Child>getChildSorted(String field)
{
return repository.findAll(Sort.by(Sort.Direction.ASC,field));
}
//pagination
public List<Child>getChildWithPagination(int offset,int pageSize)
{
Page<Child> page=repository.findAll(PageRequest.of(offset, pageSize));
return page.getContent();
}
//sorting and pagination
public List<Child>getChildWithPaginationAndSorting(int offset,int pageSize,String field)
{
Page<Child>page=repository.findAll(PageRequest.of(offset, pageSize,Sort.by(field)));
return page.getContent();
}
}