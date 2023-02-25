package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Child;
import com.example.demo.service.ApiService;

@RestController
@RequestMapping("/Child")
public class ApiController
{
@Autowired
ApiService service;
@PostMapping("")
public boolean addChild(@RequestBody Child child)
{
service.addChild(child);
return true;
}
//sorting
@GetMapping("/{field}")
public List<Child>childWithSort(@PathVariable String field)
{
return service.getChildSorted(field);
}
//pagination
@GetMapping("/{offset}/{pageSize}")
public List<Child>childWithPagination(@PathVariable int offset,@PathVariable int pageSize)
{
return service.getChildWithPagination(offset, pageSize);
}
//sorting and pagination
@GetMapping("/{offset}/{pageSize}/{field}")
public List<Child>getChildWithPaginationAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
{
return service.getChildWithPaginationAndSorting(offset, pageSize,field);
}
}
